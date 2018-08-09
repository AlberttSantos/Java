
package aula5;
public class ContaBanco {

    //atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
         public ContaBanco() {
         this.setSaldo(0);
         this.setStatus(false);
         
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void statusAtual(){
        System.out.println("-------------------------------");
        System.out.println("Conta: "+ this.getNumConta());
        System.out.println("Dono: "+ this.getDono());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: "+this.isStatus());
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        }
        else{
            this.setSaldo(150);
        }
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("A conta não pode ser fechada pq possui credito");
        }
        else if (this.getSaldo()<0) {
            System.out.println("A conta não pode ser fechado pq possui debito");
        }
        else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso !!!");
        }
    }
    
    public void depositar(float v){
        if (this.isStatus() == true){
        this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado na conta por "+this.getDono());
    }
        else{
            System.out.println("A conta na qual deseja realzar o deposito não existeS");
        }
    }
    
    public void sacar(float v){
        if (this.isStatus() == true){
            if (this.getSaldo() >= v){
            this.setSaldo(this.getSaldo()-v);
                System.out.println("Saque realizado com sucesso na conta do(a) "+this.getDono());
            }
            else{
                System.out.println("Você não tem esse valor disponovel para saque");
            }        
        }
        else{
            System.out.println("A conta na qual deseja sacar não existe");
        }
        
    }
}
