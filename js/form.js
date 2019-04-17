$(document).ready(function(){
    $('#formulario').submit(function(){
        var dados = $(this).serialize();
        //$("#carregando").html("<img src='/wp-content/themes/cedav/images/carregando.gif' class='img-fluid'>");
        $.ajax({
            type: "POST",
           // url: "/wp-content/themes/cedav/verifica-contato.php",
            data: dados,
            cache: false,
            beforeSend: function(){
               // setTimeout(function(){ $("#carregando").html(""); }, 5000);
            },
            success: function(data){
			    var resposta = '';
			    $("#resposta").empty();
			    	resposta = "<br><div class='alert btn-success text-center' role='alert'>Dados enviado com sucesso!<a href='#' class='close' data-dismiss='alert' aria-label='Close'>&times;</a></div>";
			    $("#resposta").append(resposta);
                // Limpa os dados preenchidos
                    //$("input[type=checkbox], input[type=radio]").prop("checked", false);
					$("#codProduto").val('');
					$("#nomeProduto").val('');
					$("#marca").val('');
					$("#modelo").val('');
					$("#categoria").val('');
					$("#preco").val('');
                    $("#datacadastro").val('');
                    $("#descricao").val('');
            },
            error: function(data){
                var resposta = '';
                $("#resposta").empty();
                    resposta = "<br><div class='alert btn-danger text-center' role='alert'>ERRO!, verifique o preenchimento dos campos!<a href='#' class='close' data-dismiss='alert' aria-label='Close'>&times;</a></div>";
                $("#resposta").append(resposta);
            }
        });
        return false;
    });
});  