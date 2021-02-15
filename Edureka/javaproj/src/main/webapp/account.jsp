<body style="background:#76b852">
<h1 style="text-align:center">Account Creation Screen</h1>
<form action="account" method="post">
Name:<input type="text" name="name" autofocus>
<br><br>
DOB:<input type="text" name="dob">
<br><br>
Address:<textarea name="address" rows="4" cols="15"></textarea>
<br><br>
Email-Id:<input type="email" name="eid">
<br><br>
Type of Account:<select name="acctype" >
<option>Savings Account</option>
<option>Current Account</option>
</select>
<br><br>
<input type="submit" value="Create Account">
</form>
</body>