package Q3_ProjetoSocial;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int opcao, duracaoTrabalho;
        String nomeProjeto, decricao, endereco, datainicio, datafim, descAlimento, tipoTrabalho;
        float qtde;

        opcao = Integer.parseInt(JOptionPane.showInputDialog("Menu\n<1> Cadastrar projeto Distribuir Alimentos\n<2>Cadastrar Projeto Trabalho Voluntário\n<3>Sair"));
            switch (opcao) {
                case 1:
                    nomeProjeto = JOptionPane.showInputDialog("Digite o nome do projeto");
                    decricao = JOptionPane.showInputDialog("Digite a descrição");
                    endereco = JOptionPane.showInputDialog("Digite o endereço");
                    datainicio = JOptionPane.showInputDialog("Digite a data de inicio");
                    datafim = JOptionPane.showInputDialog("Digite a data de fim");
                    descAlimento = JOptionPane.showInputDialog("Digite a descrição do alimento");
                    qtde = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade do alimento"));

                    DistribuicaoAlimento da = new DistribuicaoAlimento(nomeProjeto, decricao, endereco, datainicio, datafim, descAlimento, qtde);

                    da.validaProjeto();

                    JOptionPane.showMessageDialog(null, da.imprimeProjeto(), "Projeto Social", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 2:
                    nomeProjeto = JOptionPane.showInputDialog("Digite o nome do projeto");
                    decricao = JOptionPane.showInputDialog("Digite a descrição");
                    endereco = JOptionPane.showInputDialog("Digite o endereço");
                    datainicio = JOptionPane.showInputDialog("Digite a data de inicio");
                    datafim = JOptionPane.showInputDialog("Digite a data de fim");
                    tipoTrabalho = JOptionPane.showInputDialog("Digite o tipo de trabalho");
                    duracaoTrabalho = Integer.parseInt(JOptionPane.showInputDialog("Digite a duração do trabalho"));

                    TrabalhoVoluntario tv = new TrabalhoVoluntario(nomeProjeto, decricao, endereco, datainicio, datafim, tipoTrabalho, duracaoTrabalho);
                    tv.validaProjeto();

                    JOptionPane.showMessageDialog(null, tv.imprimeProjeto(), "Projeto Social", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"Encerrando programa", "Projeto Social", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Escolha invalida", "Projeto Social", JOptionPane.INFORMATION_MESSAGE);
                    break;
            }
    }
}
