var fs = require('fs');

var http = require('http');
var fs = require('fs');
http.createServer(function (req, res) {
    fs.readFile('input.txt', function (err, data) {
        if (err) throw err
        else {
            console.log(data)
        }
        return res.end()
    });
}).listen(8080);