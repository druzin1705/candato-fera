
package exlivro;

public class Livro {
    private String titulo; 
    private String autor;
    private String ispn;
    private int qntdPagina;
    private int ano;
    private String editora;
    private int valor;
    
    public String getTitulo(String titulo){
        
        this.titulo=titulo;
    }
    
     public String getAutor(String autor){
        
        this.autor=autor;
    }
     
     public String getIspn(String ispn){
        
        this.ispn=ispn;
        
        }
     
     public int getqntdPagina(int qntdPagina){
         
         this.qntdPagina=qntdPagina;
         
    }
      
    public int getAno(int ano){
         
         this.ano=ano;
         
    }
     
    public int getValor(int valor){
         
         this.valor=valor;
         
    }
    
    
}
