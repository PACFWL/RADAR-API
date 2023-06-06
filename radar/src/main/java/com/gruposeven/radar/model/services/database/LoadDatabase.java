package com.gruposeven.radar.model.services.database;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gruposeven.radar.model.entity.Desaparecido;
import com.gruposeven.radar.model.entity.Endereco;
import com.gruposeven.radar.model.entity.Doador;
import com.gruposeven.radar.model.entity.Familiar;
import com.gruposeven.radar.model.entity.Funcionario;
import com.gruposeven.radar.model.entity.Voluntario;

import com.gruposeven.radar.model.repository.DesaparecidosRepository;
import com.gruposeven.radar.model.repository.EnderecosRepository;
import com.gruposeven.radar.model.repository.DoadoresRepository;
import com.gruposeven.radar.model.repository.FamiliaresRepositories;
import com.gruposeven.radar.model.repository.FuncionariosRepository;
import com.gruposeven.radar.model.repository.VoluntariosRepository;

import java.time.LocalDate;
import java.util.ArrayList;

@Configuration
class LoadDatabase {

	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
	@Autowired
	DesaparecidosRepository desaparecidoRepository;
	EnderecosRepository enderecoRepository;
	DoadoresRepository doadoresRepository;
	FamiliaresRepositories familiaresRepository;
    FuncionariosRepository funcionariosRepository;
	VoluntariosRepository voluntariosRepository;
	
	@Bean
	CommandLineRunner initDatabase(DesaparecidosRepository repositoryDe, EnderecosRepository repositoryEn, DoadoresRepository repositoryDo, FamiliaresRepositories repositoryFa, FuncionariosRepository repositoryFu,
	VoluntariosRepository repositoryVo) {

		return args -> {
			repositoryDe.deleteAll();
			repositoryEn.deleteAll();
			repositoryDo.deleteAll();
			repositoryFa.deleteAll();
			repositoryFu.deleteAll();
			repositoryVo.deleteAll();
			
			Endereco endereco1 = new Endereco("2023123312","Rua A","Casa A","Bairro A","Cidade A","AM");
			log.info("Preloading " + repositoryEn.save(endereco1));
			
			Endereco endereco2 = new Endereco("27651212132","Rua B","Casa B","Bairro B","Cidade B","RR");
			log.info("Preloading " + repositoryEn.save(endereco2));
			
			Endereco endereco3 = new Endereco("34213125712","Rua C","Casa C","Bairro C","Cidade C","ES");
			log.info("Preloading " + repositoryEn.save(endereco3));
			
			Endereco endereco4 = new Endereco("17651237312","Rua D","Casa D","Bairro D","Cidade D","PE");
			log.info("Preloading " + repositoryEn.save(endereco4));
			
			Endereco endereco5 = new Endereco("29981212132","Rua E","Casa E","Bairro E","Cidade E","RO");
			log.info("Preloading " + repositoryEn.save(endereco5));
			
			Endereco endereco6 = new Endereco("38763123312","Rua F","Casa F","Bairro F","Cidade F","MG");
			log.info("Preloading " + repositoryEn.save(endereco6));
			
			Endereco endereco7 = new Endereco("25846673312","Rua G","Casa G","Bairro G","Cidade G","SP");
			log.info("Preloading " + repositoryEn.save(endereco7));
			
			Endereco endereco8 = new Endereco("23111212132","Rua H","Casa H","Bairro H","Cidade H","RS");
			log.info("Preloading " + repositoryEn.save(endereco8));
			
			Endereco endereco9 = new Endereco("34286463312","Rua I","Casa I","Bairro I","Cidade I","PA");
			log.info("Preloading " + repositoryEn.save(endereco9));
			
			Endereco endereco10 = new Endereco("25846673312","Rua G","Casa G","Bairro G","Cidade J","SP");
			log.info("Preloading " + repositoryEn.save(endereco10));
			
			Endereco endereco11 = new Endereco("23111212132","Rua H","Casa H","Bairro H","Cidade H","RS");
			log.info("Preloading " + repositoryEn.save(endereco11));
			
			Endereco endereco12 = new Endereco("34286463312","Rua I","Casa I","Bairro I","Cidade I","PA");
			log.info("Preloading " + repositoryEn.save(endereco12));
			
		
			
			
			
			List<String> fotos1 = new ArrayList<String>();
			fotos1.add("https://cdn.pixabay.com/photo/2015/12/21/05/45/girl-1102086_1280.jpg");
			fotos1.add("https://cdn.pixabay.com/photo/2015/12/21/05/45/girl-1102086_1280.jpg");
			fotos1.add("https://cdn.pixabay.com/photo/2014/09/16/01/19/girl-447701_1280.jpg");
			fotos1.add("https://cdn.pixabay.com/photo/2014/09/16/01/19/girl-447701_1280.jpg");
			
			List<String> fotos2 = new ArrayList<String>();
			fotos2.add("https://cdn.pixabay.com/photo/2015/12/21/05/45/girl-1102086_1280.jpg");
			fotos2.add("https://cdn.pixabay.com/photo/2015/12/21/05/45/girl-1102086_1280.jpg");
			fotos2.add("https://cdn.pixabay.com/photo/2014/09/16/01/19/girl-447701_1280.jpg");
			fotos2.add("https://cdn.pixabay.com/photo/2014/09/16/01/19/girl-447701_1280.jpg");
			
			List<String> fotos3 = new ArrayList<String>();
			fotos3.add("https://cdn.pixabay.com/photo/2016/11/29/20/22/girl-1871104_1280.jpg");
			fotos3.add("https://cdn.pixabay.com/photo/2014/08/08/20/55/worried-girl-413690_1280.jpg");
			fotos3.add("https://cdn.pixabay.com/photo/2014/09/16/01/19/girl-447701_1280.jpg");
			fotos3.add("https://cdn.pixabay.com/photo/2014/09/16/01/19/girl-447701_1280.jpg");
			
			List<String> fotos4 = new ArrayList<String>();
			fotos4.add("https://cdn.pixabay.com/photo/2015/12/21/05/45/girl-1102086_1280.jpg");
			fotos4.add("https://cdn.pixabay.com/photo/2015/12/21/05/45/girl-1102086_1280.jpg");
			fotos4.add("https://cdn.pixabay.com/photo/2014/09/16/01/19/girl-447701_1280.jpg");
			fotos4.add("https://cdn.pixabay.com/photo/2014/09/16/01/19/girl-447701_1280.jpg");
			
			List<String> fotos5 = new ArrayList<String>();
			fotos5.add("https://cdn.pixabay.com/photo/2015/06/22/08/40/child-817373_1280.jpg");
			fotos5.add("https://cdn.pixabay.com/photo/2014/08/08/20/55/worried-girl-413690_1280.jpg");
			fotos5.add("https://cdn.pixabay.com/photo/2014/09/16/01/19/girl-447701_1280.jpg");
			fotos5.add("https://cdn.pixabay.com/photo/2014/09/16/01/19/girl-447701_1280.jpg");
			
			List<String> fotos6 = new ArrayList<String>();
			fotos6.add("https://cdn.pixabay.com/photo/2017/07/22/20/40/girl-2529907_1280.jpg");
			fotos6.add("https://cdn.pixabay.com/photo/2014/08/08/20/55/worried-girl-413690_1280.jpg");
			fotos6.add("https://cdn.pixabay.com/photo/2014/09/16/01/19/girl-447701_1280.jpg");
			fotos6.add("https://cdn.pixabay.com/photo/2014/09/16/01/19/girl-447701_1280.jpg");
			
			List<String> fotos7 = new ArrayList<String>();
			fotos7.add("https://cdn.pixabay.com/photo/2017/07/22/20/40/girl-2529907_1280.jpg");
			fotos7.add("https://cdn.pixabay.com/photo/2014/08/08/20/55/worried-girl-413690_1280.jpg");
			fotos7.add("https://cdn.pixabay.com/photo/2014/09/16/01/19/girl-447701_1280.jpg");
			fotos7.add("https://cdn.pixabay.com/photo/2014/09/16/01/19/girl-447701_1280.jpg");
			
			List<String> fotos8 = new ArrayList<String>();
			fotos8.add("https://cdn.pixabay.com/photo/2017/07/22/20/40/girl-2529907_1280.jpg");
			fotos8.add("https://cdn.pixabay.com/photo/2014/08/08/20/55/worried-girl-413690_1280.jpg");
			fotos8.add("https://cdn.pixabay.com/photo/2014/09/16/01/19/girl-447701_1280.jpg");
			fotos8.add("https://cdn.pixabay.com/photo/2014/09/16/01/19/girl-447701_1280.jpg");
			
			List<String> fotos9 = new ArrayList<String>();
			fotos9.add("https://cdn.pixabay.com/photo/2015/06/22/08/40/child-817373_1280.jpg");
			fotos9.add("https://cdn.pixabay.com/photo/2014/08/08/20/55/worried-girl-413690_1280.jpg");
			fotos9.add("https://cdn.pixabay.com/photo/2014/09/16/01/19/girl-447701_1280.jpg");
			fotos9.add("https://cdn.pixabay.com/photo/2014/09/16/01/19/girl-447701_1280.jpg");
			
			List<String> fotos10 = new ArrayList<String>();
			fotos10.add("https://cdn.pixabay.com/photo/2015/06/22/08/40/child-817373_1280.jpg");
			fotos10.add("https://cdn.pixabay.com/photo/2014/08/08/20/55/worried-girl-413690_1280.jpg");
			fotos10.add("https://cdn.pixabay.com/photo/2014/09/16/01/19/girl-447701_1280.jpg");
			fotos10.add("https://cdn.pixabay.com/photo/2014/09/16/01/19/girl-447701_1280.jpg");
			
			List<String> fotos11 = new ArrayList<String>();
			fotos11.add("https://cdn.pixabay.com/photo/2016/11/29/20/22/girl-1871104_1280.jpg");
			fotos11.add("https://cdn.pixabay.com/photo/2014/08/08/20/55/worried-girl-413690_1280.jpg");
			fotos11.add("https://cdn.pixabay.com/photo/2014/09/16/01/19/girl-447701_1280.jpg");
			fotos11.add("https://cdn.pixabay.com/photo/2014/09/16/01/19/girl-447701_1280.jpg");
			
			List<String> fotos12 = new ArrayList<String>();
			fotos12.add("https://cdn.pixabay.com/photo/2014/09/16/01/19/girl-447701_1280.jpg");
			fotos12.add("https://cdn.pixabay.com/photo/2014/09/16/01/19/girl-447701_1280.jpg");
			fotos12.add("https://cdn.pixabay.com/photo/2014/09/16/01/19/girl-447701_1280.jpg");
			fotos12.add("https://cdn.pixabay.com/photo/2014/09/16/01/19/girl-447701_1280.jpg");
			
			List<String> roles1 = new ArrayList<String>();
			roles1.add("Admin");
			
			List<String> roles2 = new ArrayList<String>();
			roles2.add("Admin");
			
			List<String> roles3 = new ArrayList<String>();
			roles3.add("Admin");
			
			List<String> roles4 = new ArrayList<String>();
			roles4.add("Admin");
			
			Desaparecido desaparecido1 = new Desaparecido("John", "Biden", "19/08/2021", " 21:10", "Jovem", "19/08/2000", "2000", endereco1 , fotos1, "Não","Cor de pele A", "Não", "Sim", "1.81", "M");
			log.info("Preloading " + repositoryDe.save(desaparecido1));
			
			Desaparecido desaparecido2 = new Desaparecido("Sarah", "Burton", "11/07/2021", " 21:10", "Jovem", "29/09/1999", "5000", endereco2 , fotos2, "Não","Cor de pele B", "Não", "Não", "1.90", "F");
			log.info("Preloading " + repositoryDe.save(desaparecido2));
			
			Desaparecido desaparecido3 = new Desaparecido("Ryan", "McGregor", "09/07/2020", " 20:20", "Jovem", "06/02/1995", "250000", endereco3 , fotos3, "Não","Cor de pele C", "True", "Não", "1.50", "M");
			log.info("Preloading " + repositoryDe.save(desaparecido3));
			
			Desaparecido desaparecido4 = new Desaparecido("Erling", "Halland", "10/05/2021", " 16:10", "Jovem", "03/07/1980", "234000", endereco4 , fotos4, "Não","Cor de pele D", "True", "Sim", "1.33", "M");
			log.info("Preloading " + repositoryDe.save(desaparecido4));
			
			
			Desaparecido desaparecido5 = new Desaparecido("Dina", "Boluarte", "10/01/2021", " 11:10", "Jovem", "11/09/1998", "2800", endereco5 , fotos5, "Não","Cor de pele E", "Não", "Sim", "1.70", "F");
			log.info("Preloading " + repositoryDe.save(desaparecido5));
			
			
			
			Desaparecido desaparecido6 = new Desaparecido("Gabriel", "Boric", "12/09/2021", " 20:10", "Jovem", "09/12/2002", "2700", endereco6 , fotos6, "Não","Cor de pele G", "Não", "Sim", "1.50", "M");
			log.info("Preloading " + repositoryDe.save(desaparecido6));
			
			
			Desaparecido desaparecido7 = new Desaparecido("Guillermo", "Lasso", "10/05/2021", " 22:40", "Jovem", "05/11/1978", "1000", endereco7 , fotos7, "Não","Cor de pele H", "Não", "Não", "1.76", "M");
			log.info("Preloading " + repositoryDe.save(desaparecido7));
			
			Desaparecido desaparecido8 = new Desaparecido("Lacalle", "Pou", "08/03/2021", " 16:30", "Jovem", "26/07/1999", "6000", endereco8 , fotos8, "Sim","Cor de pele I", "Não", "Sim", "1.90", "M");
			log.info("Preloading " + repositoryDe.save(desaparecido8));
			
			
			Desaparecido desaparecido9 = new Desaparecido("Gustavo", "Petro", "19/02/2021", " 11:46", "Jovem", "09/01/1998", "2750", endereco9 , fotos9, "Não","Cor de pele J", "Sim", "Sim", "1.78", "M");
			log.info("Preloading " + repositoryDe.save(desaparecido9));
			
			
			Desaparecido desaparecido10 = new Desaparecido("Magnus", "Karsen", "19/06/2021", " 09:27", "Jovem", "20/06/1989", "9000", endereco10 , fotos10, "Sim","Cor de pele K", "Não", "Sim", "1.88", "M");
			log.info("Preloading " + repositoryDe.save(desaparecido10));
			
			
			Desaparecido desaparecido11 = new Desaparecido("Lang", "Lang", "26/08/2021", " 06:54", "Jovem", "23/03/2003", "2500", endereco11 , fotos11, "Sim","Cor de pele L", "Sim", "Sim", "1.80", "M");
			log.info("Preloading " + repositoryDe.save(desaparecido11));
			
			Desaparecido desaparecido12 = new Desaparecido("John", "Smith", "30/09/2021", " 04:45", "Jovem ", "17/04/2004", "3000", endereco12 , fotos12, "Não","Cor de pele M", "Sim", "Sim", "1.50", "M");
			log.info("Preloading " + repositoryDe.save(desaparecido12));
			
			//String nomeDesaparecido, String sobrenomeDesaparecido, String dataDesaparecimento, String horaDesaparecimento, String descricaoDesaparecido, String dataNascimento, String recompensa, Endereco endereco, List<String> fotos, String possuiDoenca, String corDePeleDesaparecido, String tatuagemDesaparecido, String cicatriz, Double tamanhoDesaparecido, String sexoDesaparecido
			
			Doador doador1 = new Doador("Derick", "Anck", "2312315325", endereco7, 10000.50, "1195923434541");
			log.info("Preloading " + repositoryDo.save(doador1));
			
			Doador doador2 = new Doador("Lionel", "Messi", "231981765", endereco9, 90000.50, "1195923439941");
			log.info("Preloading " + repositoryDo.save(doador2));
			
            Doador doador3 = new Doador("Cristiano", "Ronaldo", "9872315325", endereco6, 990000.50, "1198823434541");
			log.info("Preloading " + repositoryDo.save(doador3));
			
			//String nome, String sobrenome, String cpf, Endereco endereco, Double valor, String telefone) 
			LocalDate date1 = LocalDate.of(1989, 1, 8);
			LocalDate date2 = LocalDate.of(2002, 7, 1);
			LocalDate date3 = LocalDate.of(1970, 5, 8);
			
			Familiar familiar1 = new Familiar("Thomas Muller", "21321353245435", "abcdefgh@gmail.com", "11969242342", "1°Grau(Pai)", "19/01/2000", desaparecido1);
			log.info("Preloading " + repositoryFa.save(familiar1));
			
			Familiar familiar2 = new Familiar("Tales de Mileto", "213277777245435", "talesdemileto@gmail.com", "119692999742", "2°Grau(Primo)", "09/09/2000", desaparecido2);
			log.info("Preloading " + repositoryFa.save(familiar2));
			
            Familiar familiar3 = new Familiar("Javier Milei", "213213666685435", "dolareslakaka@gmail.com", "119692475382", "3°Grau(Avô)", "18/05/2000", desaparecido3);
			log.info("Preloading " + repositoryFa.save(familiar3));
			
			
			/**
			Funcionario funcionario1 = new Funcionario("Ernesto", "Amorim", "213214532543", "alguien@gmail.com", "29/01/2002", roles1,"erne0001","ernesto2023", endereco1, "0119897773534", "Designer A");
		    log.info("Preloading " + repositoryFu.save(funcionario1));
			
			Funcionario funcionario2 = new Funcionario("Leornado", "Leal", "213580032543", "chistoso@gmail.com", "25/11/2000", roles2,"leal0001","leonardo2023", endereco2, "0119884233534", "Designer B");
		    log.info("Preloading " + repositoryFu.save(funcionario2));
			**/
			
			
			//String nome, String sobrenome, String cpf, String email, String dataNascimento,List<String> roles, String username, String password, Endereco endereco, String phone, String funcao
			
			
			
			Voluntario voluntario1 = new Voluntario("Ademir", "Guia", "18/06/1979", "sadwerw@gmail.com", "01196943325436", "2135436543654", endereco4, true, false);
			log.info("Preloading " + repositoryVo.save(voluntario1));
			
			Voluntario voluntario2 = new Voluntario("Bin", "Salman", "18/06/1979", "arabic@gmail.com", "01196943325436", "2135400043654", endereco5, true, false);
			log.info("Preloading " + repositoryVo.save(voluntario2));
			
			Voluntario voluntario3 = new Voluntario("Oliver", "Benji", "18/06/1999", "captaintsubasa@gmail.com", "01196943856436", "21234436543654", endereco6, true, false);
			log.info("Preloading " + repositoryVo.save(voluntario3));
			
			Voluntario voluntario4 = new Voluntario("Paolo", "De Rossi", "18/06/1980", "bellaitaly@gmail.com", "01196968645436", "213566743654", endereco7, true, false);
			log.info("Preloading " + repositoryVo.save(voluntario4));
			
			
		};
	}
	
}
