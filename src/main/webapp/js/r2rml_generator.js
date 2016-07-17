'use strict';

var R2RML = new Blockly.Generator('R2RML');
var countTripleMap = 0;
var triplesmap = "";
var triplemapId = "";
/**
 * List of illegal variable names.
 * This is not intended to be a security feature.  Blockly is 100% client-side,
 * so bypassing this list is trivial.  This is intended to prevent users from
 * accidentally clobbering a built-in object or function.
 * @private
 */
R2RML.addReservedWords('');
// R2RML.EXAMPLE = "###\n";

/**
 * Initialise the database of variable names.
 * @param {!Blockly.Workspace} workspace Workspace to generate code from.
 */
R2RML.init = function(workspace) {
  countTripleMap = 0;
  triplesmap = "";
};

/**
 * Prepend the generated code with the variable definitions.
 * @param {string} code Generated code.
 * @return {string} Completed code.
 */
R2RML.finish = function(code) {
  return code;
};

/**
 * Naked values are top-level blocks with outputs that aren't plugged into
 * anything.  A trailing semicolon is needed to make this legal.
 * @param {string} line Line of generated code.
 * @return {string} Legal line of code.
 */
R2RML.scrubNakedValue = function(line) {
  return line + ';\n';
};

/**
 * Encode a string as a properly escaped R2RML string, complete with
 * quotes.
 * @param {string} string Text to encode.
 * @return {string} R2RML string.
 * @private
 */
R2RML.quote_ = function(string) {
  // TODO: This is a quick hack.  Replace with goog.string.quote
  string = string.replace(/\\/g, '\\\\')
                 .replace(/\n/g, '\\\n')
                 .replace(/'/g, '\\\'');
  return '\'' + string + '\'';
};

/**
 * Common tasks for generating R2RML from blocks.
 * Handles comments for the specified block and any connected value blocks.
 * Calls any statements following this block.
 * @param {!Blockly.Block} block The current block.
 * @param {string} code The R2RML code created for this block.
 * @return {string} R2RML code with comments and subsequent blocks added.
 * @private
 */
R2RML.scrub_ = function(block, code) {
  var commentCode = '';
  // Only collect comments for blocks that aren't inline.
  if (!block.outputConnection || !block.outputConnection.targetConnection) {
    // Collect comment for this block.
    var comment = block.getCommentText();
    if (comment) {
      commentCode += R2RML.prefixLines(comment, '// ') + '\n';
    }
    // Collect comments for all value arguments.
    // Don't collect comments for nested statements.
    for (var x = 0; x < block.inputList.length; x++) {
      if (block.inputList[x].type == Blockly.INPUT_VALUE) {
        var childBlock = block.inputList[x].connection.targetBlock();
        if (childBlock) {
          var childComment = R2RML.allNestedComments(childBlock);
          if (childComment) {
            commentCode += R2RML.prefixLines(childComment, '// ');
          }
        }
      }
    }
  }
  var nextBlock = block.nextConnection && block.nextConnection.targetBlock();
  var nextCode = R2RML.blockToCode(nextBlock);
  return commentCode + code + nextCode;
};

function isDisconnected(block) {
  return block.getParent() == undefined;
}

R2RML.mapping = function(block) {
  if (!block) {
    return '';
  }
  var mapping = '# Mapping created using R2RML editor. \n  @prefix rr: <http://www.w3.org/ns/r2rml#> . \n'; 
  mapping +=  R2RML.statementToCode(block, 'mapping');
  mapping +=  "\n" + R2RML.statementToCode(block, 'triplesmap');
  return mapping + triplesmap;
};

R2RML.prefix = function(block) {
  if (isDisconnected(block)) {
    return '';
  }
  
  var prefix = block.getFieldValue('PREFIX');
  var uri = block.getFieldValue('URI');
  return "@prefix "+ prefix +": <" + uri + "> .\n";
};

R2RML.triplemap = function(block) {
  if (isDisconnected(block)) {
    return '';
  }

  countTripleMap++;
  triplemapId = "TripleMap" + countTripleMap;
  return "<" + triplemapId + ">\n" + "rr:logicalTable [ " + R2RML.statementToCode(block, 'logicaltable') + "];"  
              + "\n " + R2RML.statementToCode(block, 'triplemap')  + " . \n\n"; 
};

R2RML.tablesqlquery = function(block) {
  if (isDisconnected(block)) {
    return '';
  }

  return "\n" + (block.getFieldValue('TABLESQLQUERY') == 'table' ? 'rr:tableName' : 'rr:sqlQuery') 
          + " \"" + block.getFieldValue('TABLESQLQUERYVALUE') + "\";\n";
};

R2RML.subjectmap = function(block) {
  if (isDisconnected(block)) {
    return '';
  }

  return "rr:subjectMap [ \n" + R2RML.statementToCode(block, 'subjectmap') + "]; \n";
};

R2RML.class = function(block) {
  if (isDisconnected(block)) {
    return '';
  }

  return "rr:class " + block.getFieldValue('CLASS') + ";\n";
};

R2RML.predicateobjectmap = function(block) {
  if (isDisconnected(block)) {
    return '';
  }

  return "rr:predicateObjectMap [ \n" + R2RML.statementToCode(block, 'ppredicateobjectmap') + "\n " + R2RML.statementToCode(block, 'opredicateobjectmap') + "]; \n";;
};

R2RML.objectmap = function(block) {
  if (isDisconnected(block)) {
    return '';
  }

  return "rr:objectMap [ \n" + R2RML.statementToCode(block, 'objectmap') + "]; \n";
};

R2RML.predicatemap = function(block) {
  if (isDisconnected(block)) {
    return '';
  }

  return "rr:predicateMap [ \n" + R2RML.statementToCode(block, 'predicatemap') + "]; \n";
};

R2RML.object = function(block) {
  if (isDisconnected(block)) {
    return '';
  }

  return "rr:object " + block.getFieldValue('OBJECT') + ";\n";
};

R2RML.predicate = function(block) {
  if (isDisconnected(block)) {
    return '';
  }

  return "rr:predicate " + block.getFieldValue('PREDICATE') + ";\n";
};

R2RML.inverseexpression = function(block) {
  if (isDisconnected(block)) {
    return '';
  }

  return "rr:inverseExpression \"" + block.getFieldValue('INVERSEEXPRESSION') + "\";\n";
};

R2RML.datatype = function(block) {
  if (isDisconnected(block)) {
    return '';
  }

  return "rr:datatype " + block.getFieldValue('DATATYPE') + ";\n";
};

R2RML.language = function(block) {
  if (isDisconnected(block)) {
    return '';
  }

  return "rr:language \"" + block.getFieldValue('LANGUAGE') + "\";\n";
};

R2RML.joincondition = function(block) {
  if (isDisconnected(block)) {
    return '';
  }

  return "rr:joinCondition [ \n   rr:child \"" + block.getFieldValue('CHILD') + ";\n   rr:parent \"" + block.getFieldValue('PARENT') + "\";\n];";
};

R2RML.parenttriplesmap = function(block) {
  if (isDisconnected(block)) {
    return '';
  }

  triplesmap += R2RML.statementToCode(block, 'parenttriplesmap') + "\n";
  return "rr:parentTriplesMap <" + triplemapId + ">;\n" + R2RML.statementToCode(block, 'joincondition') + "\n"; 
};

function termtype(block) {
  if (isDisconnected(block)) {
    return '';
  }

  var code = "rr:termType ";
  var termtype = block.getFieldValue('TERMTYPE');
  if(termtype == 'termtypeiri'){
    code += 'rr:IRI';
  } else if(termtype == 'termtypeblanknode'){
    code += 'rr:BlankNode';
  } else {
    code += 'rr:Literal';
  }
  code +=  ";\n";
  return code;
}

function termmap(block) {
  if (isDisconnected(block)) {
    return '';
  }

  var code = "";
  var termmap = block.getFieldValue('TERMMAP');
  if(termmap == 'CONSTANT'){
    code += 'rr:constant';
  } else if(termmap == 'TEMPLATE'){
    code += 'rr:template';
  } else {
    code += 'rr:column';
  }
  code += " \"" + block.getFieldValue('TERMMAPVALUE') + "\";\n";
  return code;
}

R2RML.subjecttermtype = function(block) {
  return termtype(block);
};

R2RML.subjecttermmap = function(block) {
  return termmap(block);
};

R2RML.predicatetermtype = function(block) {
  return termtype(block);
};

R2RML.predicatetermmap = function(block) {
  return termmap(block);
};

R2RML.objecttermtype = function(block) {
  return termtype(block);
};

R2RML.objecttermmap = function(block) {
  return termmap(block);
};

