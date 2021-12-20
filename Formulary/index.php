<?php
session_start();
?>

<html>
    <head>
        <tittle><img src="img/garca.png"></tittle>
        <?php
		if(isset($_SESSION['msg'])){
			echo $_SESSION['msg'];
			unset($_SESSION['msg']);
		}
		?>
</head>
<link rel="stylesheet" type="text/css" href="css.css">
    <body>
        <fieldset id="hcenter" style="width: 15%; height: 05%; position: absolute; 
    left: 63%; top: 5px;";>
        <h3 id="helpc"> Central de Ajuda </h3>
       
</fieldset>
<br>
        <fieldset style="width: 30%; position: absolute; 
    left: 55%; top: 65px;";>
        <form method="POST" action="processa.php" >
        <p id="nuser"> Nome do Usuário:</p>
        <p>
        <input type="text" name="nome"> </p>
        <p id="depart"> Departamento: </p>
        <p>
        <input type="text" name="departamento"></p>
        <p> Email: </p>
        <p>
        <input type="varchar" name="email" size=30></p>
        <p> Telefone: </p>
        <p> <input type="smallint" name="telefone" size=11> </p>
        <p id="desc"> Descrição do produto: </p>
        <p>
        <input type="text" name="descricao_produto"></p>
        <p id="number"> N° do equipamento: </p>
        <p>
        <input type="int" name="numero_dep" size=1></p>
        <p id="description"> Descrição do problema: </p>
        <p>
        <input type="text" name="descricao_problema"></p>
        <p><input id="buttom" type="submit" value="Enviar"></p>
     </form>
</fieldset>
<fieldset style="width: 200px; position: absolute; 
    right: 65%; top: 240px; ";>
<h1> Fale conosco<h1>
<h1></h1>    
<p id="tel">telefone: (11) 25346-8809</p>
<p id="mail"> email: suportetec@gmail.com</p>    
</fieldset>
<br>
<!-- <fieldset style="width: 200px; height: 200px; position: absolute; 
    right: 60%; top: 320px; ";>
<p> telefone: (11) 25346-8809</p>
<p> email: suportetec@gmail.com</p>
</fieldset> -->
        
   
    </body>
</html>