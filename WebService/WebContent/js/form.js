$(document).ready(function(){
	$("#formulario").submit(function(){
		var dados = $(this).serialize();
		$.ajax({
			type:"POST",
			data:dados,
			url:"ServletProcess",
			success:function(data){
				var resposta = '';
			    $("#resposta").empty();
			    	resposta = "<br><div class='alert btn-success text-center' id='resposta' role='alert'>Dados enviado com sucesso, aguarde nosso contato!<a href='#' class='close' data-dismiss='alert' aria-label='Close'>&times;</a></div>";
			    $("#resposta").append(resposta);
			}
		});
	});
});  