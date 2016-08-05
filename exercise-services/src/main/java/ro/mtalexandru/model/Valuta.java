//package ro.mtalexandru.model;
//
//import javax.xml.bind.annotation.XmlRootElement;
//
///**
// * Created by malexandru on 8/5/2016.
// */
//@XmlRootElement
//public class Valuta {
//
//    String denumire;
//    String valoareVanzare;
//    String valoareCumparare;
//    String banca;
//
//    private Valuta(String denumire, String valoareVanzare, String valoareCumparare, String banca) {
//        this.denumire = denumire;
//        this.valoareVanzare = valoareVanzare;
//        this.valoareCumparare = valoareCumparare;
//        this.banca = banca;
//    }
//
//    public String getDenumire() {
//        return denumire;
//    }
//
//    public String getValoareVanzare() {
//        return valoareVanzare;
//    }
//
//    public String getValoareCumparare() {
//        return valoareCumparare;
//    }
//
//    public static class ValutaBuilder{
//        String denumire;
//        String valoareVanzare;
//        String valoareCumparare;
//        String banca;
//
//        public ValutaBuilder denumire(String denumire) {
//            this.denumire = denumire;
//            return this;
//        }
//
//        public ValutaBuilder valoareVanzare(String valoareVanzare) {
//            this.valoareVanzare = valoareVanzare;
//            return this;
//        }
//
//
//        public ValutaBuilder valoareCumparare(String valoareCumparare) {
//            this.valoareCumparare = valoareCumparare;
//            return this;
//        }
//        public ValutaBuilder banca(String banca) {
//            this.banca = banca;
//            return this;
//        }
//
//        public Valuta build() {
//            return new Valuta(this);
//        }
//
//    }
//
//}
