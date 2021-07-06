package thiago.exceptions;

public class CPFInvalidoException extends BusinessException {
	public CPFInvalidoException(String cpf) {
		super("CPF %s Inválido ", cpf);
	}
}
