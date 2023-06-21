import java.util.ArrayList;

public class VendaSite {
        private ArrayList<Ingresso> ingressoEvento;
        private int qtdeMax;

        public VendaSite(int qtdeMax) {
            this.ingressoEvento = new ArrayList<Ingresso>();
            this.qtdeMax = qtdeMax;
        }

        public void insereIngressoVenda(Ingresso ingresso) {
            ingressoEvento.add(ingresso);
        }

        public int getQtdeMax() {
            return qtdeMax;
        }

        public void setQtdeMax(int qtdeMax) {
            this.qtdeMax = qtdeMax;
        }

        public boolean validaQtdeIngresso() {
            return ingressoEvento.size() < qtdeMax;
        }
    }





