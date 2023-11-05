/*
Classe: Veiculo
Inicia uma instância com o atributo status com ‘D’ (disponível). Os demais dados
devem ser fornecidos via parâmetros.
O método registrarViagem() altera o atributo status para ‘V’ (viajando).
O método registrarRetorno() altera o atributo status para ‘D’ (disponível) e
atualiza o odômetro do veículo com a quilometragem recebida por parâmetro.
O método revisar() altera o atributo status para ‘M’ (manutenção).
 */
package agregacaoViagem;

public class Veiculo {

	private int idVeiculo;
	private String placa;
	private char status;
	private int kmOdometro;
	
	public Veiculo(int idVeiculo,String placa,int kmOdometro) {
		this.idVeiculo = idVeiculo;
		this.placa = placa;
		this.status= 'D';
		this.kmOdometro = kmOdometro;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getKmOdometro() {
		return kmOdometro;
	}

	public int getIdVeiculo() {
		return idVeiculo;
	}

	public char getStatus() {
		return status;
	}
	
	public void registrarViagem() {
		if(getStatus() =='D') {
		this.status= 'V';
		}
	}
	
	public void registrarRetorno(int kmOdometro) {
			this.status= 'D';
		this.kmOdometro = kmOdometro;
	}
	
	public void revisar() {
		this.status= 'M';
	}
}
