
<html>
<head>
		<title>Dragon City</title>
		<link rel="stylesheet" type="text/css" href="css/Estilos.css" /> 
		<%@ include file="/adm/inc/taghead.jsp" %>
</head>
<body>
<div id="conteudo">
	<div id="header">
	   <div id="logo"><img src="/imagens/Logo_mackenzie_fundo.png" /></div>
	   <div id="links">
		   <ul class="menu">
			   <li><a href="#">Cadastrar Jogador|</a></li>
			   <li><a href="#">Sobre o Jogo|</a></li>
			   <li><a href="#">Contate-nos</a></li>
		   </ul>
	   </div>
	</div> 
	<div align="center">
	    <img src="imagens/Logo_jogo.png" />	
    </div>  
    <p class="titulo_centralizado"><em>Seja bem vindo!Ao jogo do Ano, Dragon City!!!!<br/>Para jogar � necess�rio realizar o login</em></p>
	<div id="form">
    	<form id="form1">		
	        <p align="center">Email:<input type="text"></p>
			<p align="center">Senha:<input type="text"></p>
			<table align="center">
				<tr>
				    <td>Esqueceu a senha?</td>
			        <td><a href="esqueceu_senha.html">Clique aqui</a></td>
	                <td rowspan="2"><input type="submit" class="btn_enviar" value="Entrar"/></td>
				</tr>		
				<tr>
				    <td>Primeiro acesso?</td>
			        <td><a href="/cadastro.jsp"><c:out value></c>Clique aqui e cadastre-se</a></td>
				</tr>
			</table>
			<p align="center"> </p>
			<p align="center"></p>			
		</form>
	</div>    
	
	<div id="footer">
		<img src="/imagens/Footer.png" />
	</div>       
</div>
</body>
</html>
