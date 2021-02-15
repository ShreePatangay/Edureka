<html>

	<head>

		<title>	
		Login Screen in jsp
		</title>

	</head>
	
	<style>
		
		body {
  background: #76b852; /* fallback for old browsers */
  }
		
	</style>
	
	<body>
		<form id="form-wrapper" action="login" method="post">
		<h1 align="center">Banking System</h1>
		
		<table align="center">
     <tr>
       <td>
        <label for="txtUid">Username:</label>
       </td>
       <td>
        <input type="text" name="username" id="txtUid" size=20 autofocus>
       </td>
     </tr>

     <tr >
       <td>
        <label for="txtPwd">Password:</label>
       </td>
       <td>
        <input type="password" name="password" id="txtPwd" size=20>
       </td>
     </tr>
     
     <tr>
       <td colspan="2" align="center">
        <input type="submit" value="Submit">
       </td>
     </tr>
     
   </table>
		</form>
		</body>

</html>