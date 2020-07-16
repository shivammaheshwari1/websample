var soap = require('/var/lib/jenkins/tools/jenkins.plugins.nodejs.tools.NodeJSInstallation/node/lib/node_modules/soap');

var url = 'http://192.168.0.102:81/api/soap/mantisconnect.php?wsdl';

var user = 'administrator';

var password = 'root';

var pipelineArgs = process.argv.slice(2);

var summary = pipelineArgs[0];

summary += ' build No. ';

summary += pipelineArgs[1];

summary += ' FAILURE';

var desc = 'GENERAL INFO \nProject : '

desc += pipelineArgs[0];

desc += '\nBUILD URL : ';

desc += pipelineArgs[2];

desc += '\nConsole Log URL : ';

desc += pipelineArgs[3];

var args = {

username: user,

password: password,

issue: {

project: {

name: 'jenkins'

},

category: 'General',

summary: summary,

description: desc

}

};

soap.createClient(url, function(err, client) {

client.mc_issue_add(args, function(err1, result) {

if(err1)

console.log( err1 );

else

console.log('Issue successfully created');

});

});
