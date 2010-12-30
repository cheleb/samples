<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Index page</title>
</head>
<body>
 <script src="http://www.java.com/js/deployJava.js"></script>
    <script> 
        var attributes = {codebase: 'webstart', archive: 'france-inter-jug-applet-1.0.0.jar', code:'org.jugmontpellier.franceinterjug.client.HelloWorldApplet',  width:300, height:300} ; 
        var parameters = {jnlp_href: 'http://localhost:8080/jugs/webstart/launch2.jnlp'} ; 
        deployJava.runApplet(attributes, parameters, '1.6'); 
    </script>

<h1>Welcome page</h1>

<a href="spring/jug/list">List des jugs</a>
<a href="webstart/launch.jnlp">jnlp</a>

</body>
</html>