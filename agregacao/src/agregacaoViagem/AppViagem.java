/*
.
 Registrar o início da viagem. Alocar o veículo cadastrado na viagem. Considerar
a data de início como sendo a data atual.
 Mostrar a viagem iniciada. Observar se o veículo foi registrado e a data inicial
atualizada para a data atual.
 Mostrar os dados do veículo alocado na viagem. Observar ser o status foi
alterado para “V”.
 Registrar o fim da viagem. Considerar a data final como sendo a data atual.
 Mostrar os dados da viagem finalizada. Observar se a data final foi atualizada
para a data atual e a quilometragem percorrida armazenada.
 Mostrar os dados do veículo alocado na viagem. Observar ser o status foi
alterado para “D” e a quilometragem do odômetro atualizada.
 Colocar o veículo em manutenção.
 Mostrar os dados do veículo que foi colocado em manutenção. Observar ser o
status foi alterado para
 */
package agregacaoViagem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AppViagem {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataInicial = formato.parse("15/08/2022");
		Date dataFinal = formato.parse("25/08/2022");
		
		Viagem viagem = new Viagem(02, "Natal", dataInicial, dataFinal);
		
		System.out.println("Dados da viagem: \n" + "id: " + viagem.getIdViagem() +"\n"+ 
				"Destino: " + viagem.getDestino() + "\n" + "Data de ida: "  + viagem.getDataInicial() + "\n" 
						+ "Data de volta: " + viagem.getDataFinal());
		
		System.out.println("===========================================================================");
		
		Veiculo veiculo = new Veiculo(01, "BRA2E19", 100);
		System.out.println("Dados do veículo: \n" + "id: " + veiculo.getIdVeiculo() +"\n"+ 
		"Placa: " + veiculo.getPlaca() + "\n" + "Status: "  + veiculo.getStatus() + "\n" 
				+ "kmOdometro: " +veiculo.getKmOdometro());
		
		
		System.out.println("===========================================================================");
		if (viagem.iniciarViagem(veiculo)) {
            System.out.println("\nInício da viagem registrado com sucesso.");
        } else {
            System.out.println("\nNão foi possível iniciar a viagem, pois o veículo já está em viagem.");
        }
		
		System.out.println("===========================================================================");
		
		System.out.println("Dados da viagem iniciada: \n" + "id: " + viagem.getIdViagem() +"\n"+ 
				"Destino: " + viagem.getDestino() + "\n" + "Data de ida: "  + viagem.getDataInicial() + "\n" 
						+ "Data de volta: " + viagem.getDataFinal());
		System.out.println("===========================================================================");
		
		System.out.println("Dados do veículo da viagem:\n " + "id: " + veiculo.getIdVeiculo() +"\n"+ 
		"Placa: " + veiculo.getPlaca() + "\n" + "Status: "  + veiculo.getStatus() + "\n" 
				+ "kmOdometro: " +veiculo.getKmOdometro() );
		
		viagem.finalizarViagem(800);
		System.out.println("===========================================================================");
		
		System.out.println("Dados da viagem finalizada: \n" + "id: " + viagem.getIdViagem() +"\n"+ 
				"Destino: " + viagem.getDestino() + "\n" + "Data de ida: "  + viagem.getDataInicial() + "\n" 
						+ "Data de volta: " + viagem.getDataFinal());
		System.out.println("===========================================================================");
		
		System.out.println("Dados do veículo da viagem finalizada:\n" + "id: " + veiculo.getIdVeiculo() +"\n"+ 
				"Placa: " + veiculo.getPlaca() + "\n" + "Status: "  + veiculo.getStatus() + "\n" 
						+ "kmOdometro: " +veiculo.getKmOdometro() );
		
		System.out.println("===========================================================================");
		
		veiculo.revisar();
		System.out.println("Dados do veículo ao ser colocado em manutenção:\n" + "id: " + veiculo.getIdVeiculo() +"\n"+ 
				"Placa: " + veiculo.getPlaca() + "\n" + "Status: "  + veiculo.getStatus() + "\n" 
						+ "kmOdometro: " +veiculo.getKmOdometro());
		
	}

}
