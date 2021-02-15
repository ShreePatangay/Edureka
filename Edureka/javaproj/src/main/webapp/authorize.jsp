<style>
	body {
		background:#76b852;
	}
	label{
		text-align:center;
		margin-left:20px;
	}
     input[type=text] {
        bottom: 2px;
		
      }
 </style>
<body >
<h1>Authorize Credit Card Transactions</h1>
<form action="creditcard" method="post">
<p >
<table><tr><td>
<label for="name">Name:</label></td><td><input type="text" name="name" id="name"  autofocus></td></tr>
<tr><td>
<label for="cc">Card Number:</label></td><td><input type="text" name="cardno" id="cc"></td></tr>
<tr><td>
<label for="cvv">CVV2/CVC2:</label></td><td><input type="text" name="cvv2" id="cvv"></td></tr>
<tr><td>
<label for="amt">Amount:</label></td><td><input type="text" name="amt" id="amt" ></td></tr>
<tr><td>
<input type="submit" value="Authorize"></td></tr>
</table>
</form>

</body>