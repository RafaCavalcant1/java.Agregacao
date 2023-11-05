package polimorfisomoConsumo;

import java.util.Date;

public class Consumo {

	static private int ultimoId = 0;
	
	private int idConsumo;
	private Date data;
	private char tipoConsumo;
	private char tipoCliente;
	private double valorConsumo;
	private double valorConta;
	
	public Consumo(double valorConsumo) {
		ultimoId++;
		this.idConsumo = ultimoId;
		this.data = new Date();
		this.valorConsumo = valorConsumo;
		this.tipoCliente = 'P';
		this.tipoConsumo ='C';
		fecharConta(valorConsumo);
	}
	
	public Consumo(double valorConsumo, char tipoCliente) {
		ultimoId++;
		this.idConsumo = ultimoId;
		this.data = new Date();
		this.valorConsumo = valorConsumo;
		this.tipoCliente = tipoCliente;
		this.tipoConsumo = 'P';
		fecharConta(valorConsumo, tipoCliente);
	}
	
	
	public int getIdConsumo() {
		return idConsumo;
	}

	public Date getData() {
		return data;
	}

	public char getTipoConsumo() {
		return tipoConsumo;
	}

	public char getTipoCliente() {
		return tipoCliente;
	}

	public double getValorConsumo() {
		return valorConsumo;
	}

	public double getValorConta() {
		return valorConta;
	}
	
	@Override
	public String toString() {
		return "idConsumo: " + idConsumo+ "\n"
				+ " data: " + data + "\n"
				+ " tipoConsumo: " + tipoConsumo +"\n"
				+ " tipoCliente: "+ tipoCliente + "\n"
				+ " valorConsumo: " + valorConsumo + "\n"
				+ " valorConta: " + valorConta + "\n";
	}

	public void fecharConta(double valorConsumo) {
		double taxaServico = 0.1;
		double valorConta = (this.valorConsumo* taxaServico) + this.valorConsumo;
		
		this.valorConta = valorConta;
	}
	
	public void fecharConta(double valorConsumo, char tipoCliente) {
		
		if(tipoCliente == 'F') {
			double desconto = 10;
			double valorConta = this.valorConsumo - desconto;
			this.valorConta = valorConta;
		}
		else if (tipoCliente == 'A'){
				if(valorConsumo<=30) {
					double desconto = 3;
					double valorConta = this.valorConsumo - desconto;
					this.valorConta = valorConta;
				}
				else {
					double desconto = 5;
					double valorConta = this.valorConsumo - desconto;
					this.valorConta = valorConta;
				}
		}
		else {
			double valorConta = this.valorConsumo;
			this.valorConta = valorConta;
		}
	}
	
}
