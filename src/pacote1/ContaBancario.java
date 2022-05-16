package pacote1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ContaBancario {
    static ArrayList<Conta> contabancaria;

    public static void main(String[] args) {
    contabancaria = new ArrayList<Conta>();
       operacoes();
    }
    
    public static void operacoes (){
        
        int operacao = 
                Integer.parseInt(JOptionPane.showInputDialog("---------Selecione uma operação---------" +
                "\n|  Opção 1 - Abrir conta     |" +
                "\n|  Opção 2 - Depositar       |" +
                "\n|  Opção 3 - Sacar              |" +
                "\n|  Opção 4 - Listar              |" +
                "\n|  Opção 5 - Remover conta              |" +
                "\n|  Opção 6 - Sair                 |"));
       
        
        switch (operacao){
            case 1:
                AbrirConta();
                break;
            case 2:
                Depositar();
                break;
            case 3:
                Sacar();
                break;
            case 4:
                Listar();
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Obrigado...");
                System.exit(0);
                break; 
            default:  
                JOptionPane.showMessageDialog(null, "Opção inválida...");
                operacoes();
                break;
        }
}       
        public static void AbrirConta(){
            Pessoa pessoa = new Pessoa(null, null, null, null);
            
            pessoa.setNome(JOptionPane.showInputDialog("Nome:"));
            
            pessoa.setCPF(JOptionPane.showInputDialog("CPF:"));
            
            pessoa.setEmail(JOptionPane.showInputDialog("EMAIL:"));

            pessoa.setTipo(JOptionPane.showInputDialog("Tipo de conta: CC - CONTA CORRENTE / CP - CONTA POUPANÇA:"));
           
            Conta conta = new Conta(pessoa);
            contabancaria.add(conta);
            
            JOptionPane.showMessageDialog(null, "Sua conta foi criada com sucesso.");
            operacoes();
        }
        
        private static Conta encontrarConta(int numconta){
            Conta conta = null;
            if (contabancaria.size() > 0){ //verifica se tem contas na agencia
                for(Conta c: contabancaria){ //vendo cada conta
                    if(c.getNumconta() == numconta); // se tiver a conta que o usuario digitou
                    conta = c; //vai receber a conta
                }
            }
            return conta; // retorna o valor
        }
        
        public static void Depositar(){
            
            int numconta = Integer.parseInt(JOptionPane.showInputDialog("Número da conta para o depósito:"));
            
            Conta conta = encontrarConta(numconta);
            
            if (conta != null){
                Double valorDeposito = 
                    Double.parseDouble(JOptionPane.showInputDialog("Qual o valor para o depósito?"));
                conta.Depositar(valorDeposito);
                JOptionPane.showMessageDialog(null,"Valor depositado com sucesso!");
            } else{
                JOptionPane.showMessageDialog(null,"Conta não encontrada.");
            } 
            operacoes();
        }
        
        public static void Sacar (){
            int numconta = Integer.parseInt(JOptionPane.showInputDialog("Número da conta para o saque:"));
            
            Conta conta = encontrarConta(numconta);
            
            if (conta != null){
                Double valorSaque = 
                    Double.parseDouble(JOptionPane.showInputDialog("Qual o valor para o saque?"));
                conta.Sacar(valorSaque);
                JOptionPane.showMessageDialog(null,"Valor sacado com sucesso!");
            } else{
                JOptionPane.showMessageDialog(null,"Conta não encontrada.");
            }  
            operacoes();
        }
        
        public static void Listar (){
            if (contabancaria.size()> 0){
                for(Conta conta: contabancaria){
                    JOptionPane.showMessageDialog(null,conta);
                }
            } else{
                JOptionPane.showMessageDialog(null,"Não exitem contas cadastradas.");
                }
            operacoes();
        }
    
}
