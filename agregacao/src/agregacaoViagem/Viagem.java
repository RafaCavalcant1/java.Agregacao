package agregacaoViagem;

import java.util.Date;

public class Viagem {

	private int idViagem;
	private String destino;
	private Date dataInicial;
	private Date dataFinal;
	private int kmPecorrido;
	private Veiculo veiculo;
	
	public Viagem(int idViagem,String destino,Date dataInicial,Date dataFinal) {
		this.idViagem = idViagem;
		this.destino = destino;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
	}

	public int getIdViagem() {
		return idViagem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Date getDataInicial() {
		return dataInicial;
	}

	public Date getDataFinal() {
		return dataFinal;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public int getKmPecorrido() {
		return kmPecorrido;
	}

	public boolean iniciarViagem(Veiculo veiculo) {
		if(veiculo.getStatus()=='D') {
			this.veiculo = veiculo;
			this.dataInicial = new Date();
			veiculo.registrarViagem(); // vai alterar o registrar viagem 
			return true;
		}
			return false;
	}
	
	public void finalizarViagem(int kmOdometro) {
		this.dataFinal = new Date();
		this.kmPecorrido = calcularKmPercorrido(kmOdometro);
		veiculo.registrarRetorno(kmOdometro);
		
	}
	
	public int calcularKmPercorrido(int kmOdometro) {
		return kmOdometro - veiculo.getKmOdometro();
	}
	
}
