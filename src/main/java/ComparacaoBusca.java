public class ComparacaoBusca {

    public int buscaBinariaRecursiva(int[] v, int ini, int fim, int chave) {
        if (ini > fim){
            return -1;
        }
        int meio = ini + (fim - ini) / 2;
        if (v[meio] == chave){
            return meio;
        }
        if (v[meio] > chave){
            return buscaBinariaRecursiva(v, ini, meio - 1, chave);
        }
        return buscaBinariaRecursiva(v, meio + 1, fim, chave);
    }
    
    public int buscaBinariaIterativa(int[] v, int chave) {
        int inicio = 0, fim = v.length - 1;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;

            if (v[meio] == chave)
                return meio;

            if (v[meio] < chave)
                inicio = meio + 1;
            else
                fim = meio - 1;
        }

        return -1;
    }

}
