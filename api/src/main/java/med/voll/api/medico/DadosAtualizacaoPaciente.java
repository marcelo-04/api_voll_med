package med.voll.api.medico;

import jakarta.validation.Valid;
import med.voll.api.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
		
		Long id,
	    String nome,
	    String telefone,
	    @Valid DadosEndereco endereco
	    ) {
}
