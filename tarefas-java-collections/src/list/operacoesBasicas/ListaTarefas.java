package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> tarefasList;

    public ListaTarefas() {
        this.tarefasList = new ArrayList<>();
    }

    public void adicionarTarefa (String descricao) {
        tarefasList.add(new Tarefa(descricao));
    }

    public void removerTarefa( String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefasList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefasList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefasList.size();
    }

    public void obterDrescricoesTerefas() {
        System.out.println(tarefasList);
    }


    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println("o numero total de tarefas é " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.adicionarTarefa("lavar casa");

        System.out.println("o numero total de tarefas é " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.adicionarTarefa("lavar carro");
        listaTarefas.adicionarTarefa("lavar casa");

        System.out.println("o numero total de tarefas é " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.removerTarefa("lavar casa");

        System.out.println("o numero total de tarefas é " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.adicionarTarefa("lavar casa");
        listaTarefas.adicionarTarefa("lavar louça");

        listaTarefas.obterDrescricoesTerefas();


    }


}
