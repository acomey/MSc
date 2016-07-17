'use strict';

var mappingColour = 340;
var tripleMapColour = 200;
var mapColour = 300;
var valueColour = 120;
var parenttripleColour = 380;

Blockly.Blocks['mapping'] = {
    init: function() {
    this.appendStatementInput('mapping')
        .setCheck(['prefix'])
        .appendField('Mapping');
    this.appendStatementInput('triplesmap')
        .setCheck('triplemap')
        .appendField('Triple Maps');
    this.setColour(mappingColour);
    this.setTooltip('Creates a mapping.');
    this.setHelpUrl('https://www.w3.org/TR/r2rml/');
    this.contextMenu = false;
    this.setDeletable(false);
  }
};


Blockly.Blocks['prefix'] = {
    init: function() {
    this.setColour(valueColour);
    this.appendDummyInput('prefix')
        .appendField('')
        .appendField(new Blockly.FieldTextInput('insert prefix here'), 'PREFIX');
    this.appendDummyInput('uri')
        .appendField(':')
        .appendField(new Blockly.FieldTextInput('insert uri here'), 'URI');
    this.setInputsInline(true);
    this.setPreviousStatement(true, ['mapping','prefix']);
    this.setNextStatement(true, 'prefix');
    this.setTooltip('Creates a prefix.');
  }
};


Blockly.Blocks['tablesqlquery'] = {
    init: function() {
    this.setColour(valueColour);
    this.appendDummyInput('tablesqlquery')
        .appendField(new Blockly.FieldDropdown([['Table', 'table'], ['Sql query', 'sqlquery']]), 'TABLESQLQUERY')
        .appendField(new Blockly.FieldTextInput('insert table or sql query'), 'TABLESQLQUERYVALUE');
    this.setInputsInline(true);
    this.setPreviousStatement(true, ['logicaltable','tablesqlquery']);
    this.setTooltip('Defines a table or sql query.');
    this.setHelpUrl('https://www.w3.org/ns/r2rml#logicalTable');
  }
};

Blockly.Blocks['class'] = {
    init: function() {
    this.setColour(valueColour);
    this.appendDummyInput('class')
        .appendField('class:')
        .appendField(new Blockly.FieldTextInput('class'), 'CLASS');
    this.setInputsInline(true);
    this.setPreviousStatement(true, ['subjectmap','class', 'subjecttermmap', 'subjecttermtype']);
    this.setNextStatement(true, ['subjectmap','class', 'subjecttermmap', 'subjecttermtype']);
    this.setTooltip('Defines a class.');
    this.setHelpUrl('https://www.w3.org/ns/r2rml#class');
  }
};

Blockly.Blocks['triplemap'] = {
  init: function() {
    this.appendStatementInput('logicaltable')
        .setCheck(['tablesqlquery'])
        .appendField('Logical table');
    this.appendStatementInput('triplemap')
        .setCheck('subjectmap')
        .appendField('');
    this.setColour(tripleMapColour);
    this.setPreviousStatement(true, ['triplemap', 'subjectmap']);
    this.setNextStatement(true, 'triplemap');
    this.setTooltip('Creates a triple map.');
    this.setHelpUrl('https://www.w3.org/ns/r2rml#TriplesMap');
  }
};

Blockly.Blocks['subjectmap'] = {
    init: function() {
    this.appendStatementInput('subjectmap')
        .setCheck(['subjecttermtype', 'subjecttermmap', 'class'])
        .appendField('Subject Map');
    this.setColour(mapColour);
    this.setPreviousStatement(true, ['subjectmap','triplemap']);
    this.setNextStatement(true, ['predicateobjectmap']);
    this.setTooltip('Defines the subject.');
    this.setHelpUrl('https://www.w3.org/ns/r2rml#SubjectMap');
  }, onchange: function() {
    validateFields(this);
  }
};

Blockly.Blocks['predicateobjectmap'] = {
    init: function() {
    this.appendStatementInput('ppredicateobjectmap')
        .setCheck(['predicatemap', 'predicate'])
        .appendField('Predicate Object Map');
    this.appendStatementInput('opredicateobjectmap')
        .setCheck(['objectmap', 'object'])
        .appendField('');
    this.setColour(mapColour);
    this.setPreviousStatement(true, [ 'predicateobjectmap']);
    this.setNextStatement(true, ['predicateobjectmap']);
    this.setTooltip('Creates a predicate object map.');
    this.setHelpUrl('https://www.w3.org/ns/r2rml#PredicateObjectMap');
  }
};

Blockly.Blocks['predicatemap'] = {
    init: function() {
    this.appendStatementInput('predicatemap')
        .setCheck(['predicatemap', 'predicatetermmap', 'predicatetermtype']) // TODO and term type
        .appendField('Predicate Map');
    this.setColour(mapColour);
    this.setPreviousStatement(true, ['predicatemap']);
    // this.setNextStatement(true, ['predicatemap']); // TODO term types
    this.setTooltip('Creates a predicate map.');
    this.setHelpUrl('http://www.w3.org/ns/r2rml#PredicateMap');
  }, onchange: function() {
    validateFields(this);
  }
};

Blockly.Blocks['objectmap'] = {
    init: function() {
    this.appendStatementInput('objectmap')
        .setCheck(['objecttermmap', 'parenttriplesmap', 'language', 'datatype', 'objecttermtype'])
        .appendField('Object Map');
    this.setColour(mapColour);
    this.setPreviousStatement(true, ['objectmap']);
    this.setTooltip('Creates an object map.');
    this.setHelpUrl('http://www.w3.org/ns/r2rml#ObjectMap');
  }, onchange: function() {
    validateFields(this);
  }
};

function validateFields(block) {
  if(block.getChildren()[0] != undefined){
       var descendants = block.getChildren()[0].getDescendants();
       var typesToValidate = {'datatype': 'datatype', 'language': 'language',
                              'subjecttermmap': 'term map', 'predicatetermmap': 'term map', 
                              'objecttermmap': 'term map', 'subjecttermtype': 'term map', 
                              'predicatetermtype': 'term map', 'objecttermtype': 'term map', 'inverseexpression': 'inverse expression'};
       var hashmap = {};
       for(var key in typesToValidate) {
          hashmap[key] = 0;
       }

       for(var i = 0; i < descendants.length; i++) {
          var descendant = descendants[i];
          var type = descendant.type;
          if(type in hashmap) {
              hashmap[type] += 1;
              if(hashmap[type] > 1) {
                alert('Only one ' + typesToValidate[type]  + ' permited!');
                descendant.dispose();
                break;
            }
          }
       }
    }
}

Blockly.Blocks['predicate'] = {
    init: function() {
    this.setColour(valueColour);
    this.appendDummyInput('predicate')
        .appendField('predicate:')
        .appendField(new Blockly.FieldTextInput('insert predicate here'), 'PREDICATE');
    this.setInputsInline(true);
    this.setPreviousStatement(true, ['predicate']);
    this.setTooltip('Defines a predicate.');
    this.setHelpUrl('https://www.w3.org/ns/r2rml#predicate');
  }
};


Blockly.Blocks['object'] = {
    init: function() {
    this.setColour(valueColour);
    this.appendDummyInput('object')
        .appendField('object:')
        .appendField(new Blockly.FieldTextInput('insert object here'), 'OBJECT');
    this.setInputsInline(true);
    this.setPreviousStatement(true, ['objectmap','object']);
    this.setTooltip('Defines an object.');
    this.setHelpUrl('https://www.w3.org/ns/r2rml#object');
  }
};

// subject term map
Blockly.Blocks['subjecttermmap'] = {
    init: function() {
    this.setColour(valueColour);
    this.appendDummyInput('termmap')
        .appendField(new Blockly.FieldDropdown([['constant', 'CONSTANT'], ['column', 'COLUMN'], ['template', 'TEMPLATE']]), 'TERMMAP')
        .appendField(new Blockly.FieldTextInput('insert value'), 'TERMMAPVALUE');
    this.setInputsInline(true);
    this.setPreviousStatement(true, ['subjecttermmap', 'subjectmap', 'subjecttermtype']);
    this.setNextStatement(true, ['subjecttermmap', 'subjectmap', 'subjecttermtype']); 
    this.setTooltip('Defines a term map.');
    this.setHelpUrl('https://www.w3.org/ns/r2rml#TermMap');
  } 
};

Blockly.Blocks['subjecttermtype'] = {
    init: function() {
    this.appendDummyInput('termtype')
        .appendField('Term Type')
        .appendField(new Blockly.FieldDropdown([['iri', 'termtypeiri'], ['blank node', 'termtypeblanknode']]), 'TERMTYPE');
    this.setColour(valueColour);
    this.setPreviousStatement(true, ['subjecttermtype', 'subjectmap']);
    this.setNextStatement(true, ['subjecttermtype', 'termtypesubject']); // TODO review this
    this.setTooltip('Defines a term type.');
    this.setHelpUrl('https://www.w3.org/ns/r2rml#termType');
  }
};

//predicate term map
Blockly.Blocks['predicatetermmap'] = {
    init: function() {
    this.setColour(valueColour);
    this.appendDummyInput('termmap')
        .appendField(new Blockly.FieldDropdown([['constant', 'CONSTANT'], ['column', 'COLUMN'], ['template', 'TEMPLATE']]), 'TERMMAP')
        .appendField(new Blockly.FieldTextInput('insert value'), 'TERMMAPVALUE');
    this.setInputsInline(true);
    this.setPreviousStatement(true, ['predicatetermmap', 'predicatetermtype']);
    this.setNextStatement(true, ['predicatetermmap', 'predicatetermtype']); 
    this.setTooltip('Defines a term map.');
    this.setHelpUrl('https://www.w3.org/ns/r2rml#TermMap');
  } 
};

Blockly.Blocks['predicatetermtype'] = {
    init: function() {
    this.appendDummyInput('termtype')
        .appendField('Term Type')
        .appendField(new Blockly.FieldDropdown([['iri', 'termtypeiri']]), 'TERMTYPE');
    this.setColour(valueColour);
    this.setPreviousStatement(true, ['predicatetermtype', 'predicatetermmap']);
    this.setNextStatement(true, ['predicatetermtype', 'predicatetermmap']); // TODO review this
    this.setTooltip('Defines a term type.');
    this.setHelpUrl('https://www.w3.org/ns/r2rml#termType');
  }
};

//object term map
Blockly.Blocks['objecttermmap'] = {
    init: function() {
    this.setColour(valueColour);
    this.appendDummyInput('termmap')
        .appendField(new Blockly.FieldDropdown([['constant', 'CONSTANT'], ['column', 'COLUMN'], ['template', 'TEMPLATE']]), 'TERMMAP')
        .appendField(new Blockly.FieldTextInput('insert value'), 'TERMMAPVALUE');
    this.setInputsInline(true);
    this.setPreviousStatement(true, ['objecttermmap', 'language', 'datatype', 'inverseexpression', 'objecttermtype']);
    this.setNextStatement(true, ['objecttermmap', 'language', 'datatype', 'inverseexpression', 'objecttermtype']); 
    this.setTooltip('Defines a term map.');
    this.setHelpUrl('https://www.w3.org/ns/r2rml#TermMap');
  } 
};

Blockly.Blocks['objecttermtype'] = {
    init: function() {
    this.appendDummyInput('termtype')
        .appendField('Term Type')
        .appendField(new Blockly.FieldDropdown([['iri', 'termtypeiri'], ['blank node', 'termtypeblanknode'], ['literal', 'termtypeliteral']]), 'TERMTYPE');
    this.setColour(valueColour);
    this.setPreviousStatement(true, ['objecttermmap', 'language', 'datatype', 'inverseexpression', 'objecttermtype']);
    this.setNextStatement(true, ['objecttermmap', 'language', 'datatype', 'inverseexpression', 'objecttermtype']); 
    this.setTooltip('Defines a term type.');
    this.setHelpUrl('https://www.w3.org/ns/r2rml#termType');
  }
};

Blockly.Blocks['language'] = {
    init: function() {
    this.setColour(valueColour);
    this.appendDummyInput('language')
        .appendField('language:')
        .appendField(new Blockly.FieldTextInput('insert language here'), 'LANGUAGE');
    this.setInputsInline(true);
    this.setPreviousStatement(true, ['objectmap', 'language', 'datatype', 'language', 'objecttermtype', 'inverseexpression', 'objecttermmap']);
    this.setNextStatement(true, ['language', 'datatype', 'objecttermtype', 'inverseexpression', 'objecttermmap']); 
    this.setTooltip('Defines a language.');
    this.setHelpUrl('https://www.w3.org/ns/r2rml#language');
  }
};


Blockly.Blocks['datatype'] = {
    init: function() {
    this.setColour(valueColour);
    this.appendDummyInput('datatype')
        .appendField('datatype:')
        .appendField(new Blockly.FieldTextInput('insert datatype here'), 'DATATYPE');
    this.setInputsInline(true);
    this.setPreviousStatement(true, ['objectmap', 'datatype', 'language', 'objecttermtype', 'inverseexpression', 'objecttermmap']);
    this.setNextStatement(true, ['language', 'datatype', 'objecttermtype', 'inverseexpression', 'objecttermmap']); 
    this.setTooltip('Defines a datatype.');
    this.setHelpUrl('https://www.w3.org/ns/r2rml#datatype');
  }
};

Blockly.Blocks['inverseexpression'] = {
    init: function() {
    this.setColour(valueColour);
    this.appendDummyInput('inverseexpression')
        .appendField('Inverse expression:')
        .appendField(new Blockly.FieldTextInput('insert inverse expression here'), 'INVERSEEXPRESSION');
    this.setInputsInline(true);
    this.setPreviousStatement(true, ['objectmap', 'inverseexpression', 'language', 'datatype', 'objecttermtype', 'objecttermmap']);
    this.setNextStatement(true, ['language', 'datatype', 'objecttermtype', 'inverseexpression', 'objecttermmap']); 
    this.setTooltip('Defines an inverse expression.');
    this.setHelpUrl('http://www.w3.org/ns/r2rml#inverseExpression');
  }
};

Blockly.Blocks['parenttriplesmap'] = {
    init: function() {
    this.appendStatementInput('parenttriplesmap')
        .setCheck(['triplemap'])
        .appendField('Parent Triple Map');
    this.appendStatementInput('joincondition')
        .setCheck(['joincondition'])
        .appendField('Join Condition');
    this.setColour(parenttripleColour);
    this.setPreviousStatement(true, ['objectmap', 'parenttriplesmap']);
    this.setTooltip('Creates a parent triple map.');
    this.setHelpUrl('http://www.w3.org/ns/r2rml#parentTriplesMap');
  }
};

Blockly.Blocks['joincondition'] = {
    init: function() {
    this.setColour(parenttripleColour);
    this.appendDummyInput('joinconditionchild')
        .appendField('child:')
        .appendField(new Blockly.FieldTextInput('child'), 'CHILD');
    this.appendDummyInput('joinconditionparent')
        .appendField('parent:')
        .appendField(new Blockly.FieldTextInput('parent'), 'PARENT');
    this.setPreviousStatement(true, ['parenttriplesmap','joincondition']);
    this.setTooltip('Defines a join condition.');
    this.setHelpUrl('http://www.w3.org/ns/r2rml#joinCondition');
  }
};


// Utils

//************************************
//find all blocks on workspace by type
//************************************
function getBlocksByType(type) {
  var blocks = [];
  for (var blockID in workspace.blockDB_) {
    if (workspace.blockDB_[blockID].type == type) {
      blocks.push(workspace.blockDB_[blockID]);
    }
  }
  return(blocks);
}

function isAnyDisconnected() {
  for (var blockID in workspace.blockDB_) {
    if (workspace.blockDB_[blockID].type != 'mapping' && workspace.blockDB_[blockID].getParent() == undefined) {
      return true;
    }
  }
  return false;
}

/*
export
var xml = Blockly.Xml.workspaceToDom(workspace);
var xml_text = Blockly.Xml.domToText(xml);


import
var xml = Blockly.Xml.textToDom(xml_text);
Blockly.Xml.domToWorkspace(xml, workspace);

*/
