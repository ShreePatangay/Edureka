<body style="background: #76b852">
	<h1 style="text-align: center">Perform Debit or Credit Operations</h1>
	<form action="transaction" method="post" >
		<table>
			<tr>
				<td><label for="acno">Account number:</label></td>
				<td><input type="text" id="acno" name="accno" autofocus></input></td>
			</tr>
			<tr>
				<td><label for="amount">Amount:</label></td>
				<td><input type="text" id="amount" name="amt"></input></td>
			</tr>
			<tr>
				<td><input type="submit" name="debit" value="Debit From" formaction="debitfrom" formtarget="_self">
				</td>
				<td><input type="submit" name="credit" value="Credit To" formaction="creditto" formtarget="_self">
				</td>
			</tr>
		</table>
	</form>
</body>