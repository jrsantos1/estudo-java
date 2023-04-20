
public class Fila<T> {

    No<T> refNoEntradaFila;

    public Fila(){
        this.refNoEntradaFila = null;
    }

    public boolean isEmpty(){
        if (refNoEntradaFila == null)
            return true;
        return false;
    }

    public void enqueue(T conteudo){
        No<T> novoNo = new No<T>(conteudo);
        novoNo.setNoRef(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public T first(){
        No<T> noEntrada = refNoEntradaFila;
        if(!isEmpty()){
            while(true){
                if(noEntrada.getNoRef() != null){
                    noEntrada = noEntrada.getNoRef();
                }else
                    break;
                }
            return (T) noEntrada.getConteudo();
            }
        return null;
        }

    public No<T> dequeue(){
        No<T> primeiroNo = refNoEntradaFila;
        No<T> noAux = refNoEntradaFila;
        if (this.isEmpty())
            return null;
        while (true){
            if(primeiroNo.getNoRef() != null){
                noAux = primeiroNo;
                primeiroNo = primeiroNo.getNoRef();
            }else {
                noAux.setNoRef(null);
                break;
            }
        }
        return primeiroNo;

    }

    @Override
    public String toString(){
        String stringRetorno = "";

        if(this.isEmpty())
            return "";
        No<T> noAux = refNoEntradaFila;
        boolean validaLooping = true;
        while (validaLooping){

            if(noAux.getNoRef() != null) {
                stringRetorno += " | " + noAux.getConteudo() + " | ";
                noAux = noAux.getNoRef();
            }else {

                stringRetorno += noAux.getConteudo() + " | null |";
                validaLooping = false;
            }
        }
        return stringRetorno;
    }


}
