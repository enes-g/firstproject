package JavaOop;

public class CepTelefonu {

    public static void main(String[] args) {
        Phone phone = new Phone();
        JetonluTelefon jetonluTelefon = new JetonluTelefon();
        EvTelefonu evTelefonu = new EvTelefonu();
        System.out.println("Cep Telefonu Arama Sonucu"  +   phone.TelefonEt("05387705158"));
        System.out.println("JetonluTelefon Arama Sonucu" +  jetonluTelefon.TelefonEt("05503080394"));
        System.out.println("Ev Telefonu Arama Sonucu" +  evTelefonu.TelefonEt("05364530559"));

    }


    static class Phone implements Telefon {

        private boolean kontorVarMi = true;
        private boolean operatorUygunMu = true;

        @Override
        public String TelefonEt(String TelNo) {
            if (kontorVarMi) {
                if (operatorUygunMu)
                    return TelNo + " aranıyor...";
                else
                    return "Hatlar yoğun sonra ara.";
            } else
                return "Kontörünüz yok.";
        }

    }

   static class JetonluTelefon implements Telefon {
        private boolean jetonVarMi = true;

        @Override
        public String TelefonEt(String TelNo) {
            if (jetonVarMi) {
                return TelNo + " aranıyor...";
            } else
                return "Jetonunuz yok.";
        }
    }

   static class EvTelefonu implements Telefon {

        private boolean faturaYatirildiMi = true;

        @Override
        public String TelefonEt(String TelNo) {
            if (faturaYatirildiMi)
                return TelNo + " aranıyor...";
            else
                return "Faturayı yatırmamışsın. Bir yeri arıyamazsın";
        }
    }
}