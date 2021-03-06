package empresa;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class empresa {

	String nome;

	String carregarempresa() throws IOException{ // colocara nome na empresa
		
	    FileReader arq = new FileReader("nome da empresa.txt");
	    BufferedReader lerArq = new BufferedReader(arq);
	    String linha = lerArq.readLine();
	    
	    while(linha != null) {	// se tiver nome no registro ele apenas colocara no lugar.
	    	nome = linha;
	    	linha = lerArq.readLine();// Olha a proxima linha
	    }

	    arq.close();
            if(nome == null) return "Nome da empresa";
		return (String)nome;
}
	
	public void salvarnome(String nome) throws IOException {
	    FileWriter arq = new FileWriter("nome da empresa.txt");
	    PrintWriter gravarArq = new PrintWriter(arq);
	     gravarArq.printf(nome);
		arq.close();
	}

		public void salvardinheiro(float dinheiro) throws IOException{
		    PrintWriter arq = new PrintWriter("verba.txt");
		    PrintWriter gravarArq = new PrintWriter(arq);
		    gravarArq.printf(""+dinheiro);
			arq.close();
		}
		float carregardinheiro() throws IOException {//O slogan da empresa
		    FileReader arq = new FileReader("verba.txt");
		    BufferedReader lerArq = new BufferedReader(arq);
		    String linha = lerArq.readLine();
                    float capital = 0;
		    while(linha != null) {	// se tiver nome no registro ele apenas colocara no lugar.
		    	nome = linha;
                        capital = Float.parseFloat(nome);
		    	linha = lerArq.readLine();
                    }

		    arq.close();
		    return (float)capital;
		}
                
		public void salvarlv(int level) throws IOException{
		    PrintWriter arq = new PrintWriter("lv.txt");
		    PrintWriter gravarArq = new PrintWriter(arq);
		    gravarArq.printf(""+level);
			arq.close();
		}
                
		int carregarlv() throws IOException {//O slogan da empresa
		    FileReader arq = new FileReader("lv.txt");
		    BufferedReader lerArq = new BufferedReader(arq);
		    String linha = lerArq.readLine();
                    int lv = 0;
		    while(linha != null) {	// se tiver nome no registro ele apenas colocara no lugar.
		    	nome = linha;
                        lv = Integer.parseInt(nome);
		    	linha = lerArq.readLine();
                    }

                    arq.close();
		    return lv;
		}
                
                public void salvardivida(int divida) throws IOException{
		    PrintWriter arq = new PrintWriter("divida.txt");
		    PrintWriter gravarArq = new PrintWriter(arq);
		    gravarArq.printf(""+divida);
			arq.close();
		}
                
		float carregardivida() throws IOException {//O slogan da empresa
		    FileReader arq = new FileReader("divida.txt");
		    BufferedReader lerArq = new BufferedReader(arq);
		    String linha = lerArq.readLine();
                    float divida = 0;
		    while(linha != null) {	// se tiver nome no registro ele apenas colocara no lugar.
		    	nome = linha;
                        divida = Integer.parseInt(nome);
		    	linha = lerArq.readLine();
                    }
                    arq.close();
		    return divida;
		}
                
                
}