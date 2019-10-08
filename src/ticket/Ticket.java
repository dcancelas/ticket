package ticket;

import javax.swing.JOptionPane;

public class Ticket {

    public static void main(String[] args) {
        System.out.println("");
        String numUnid=JOptionPane.showInputDialog(null,"Introduce o número de unidades: ",
        "TicketCompra [DCancelas]",JOptionPane.INFORMATION_MESSAGE);
                if (numUnid!=null) {
                    try{int i=Integer.parseInt(numUnid);
                    }catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(null,"O caracter introducido non é un número",
                        "TicketCompra [DCancelas]",JOptionPane.ERROR_MESSAGE);
                    }
                }
            int numUnidResp=Integer.parseInt(numUnid);
        String precUnid=JOptionPane.showInputDialog(null,"Introduce o precio da unidade: ",
        "TicketCompra [DCancelas]",JOptionPane.INFORMATION_MESSAGE);
                if (precUnid!=null) {
                    try{int i=Integer.parseInt(precUnid);
                    }catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(null,"O caracter introducido non é un número",
                        "TicketCompra [DCancelas]",JOptionPane.ERROR_MESSAGE);
                    }
                }
            float precUnidResp=Float.parseFloat(precUnid);
        float total=(numUnidResp*precUnidResp);

            JOptionPane.showMessageDialog(null,"O importe total é de: "+total+"€",
            "TicketCompra [DCancelas]",JOptionPane.PLAIN_MESSAGE);
        String pago=JOptionPane.showInputDialog(null,"Introduce a cantidade a pagar: ",
        "TicketCompra [DCancelas]",JOptionPane.INFORMATION_MESSAGE);
            float pagoResp=Float.parseFloat(pago);
            float cambio=(pagoResp-total);
            
        JOptionPane.showMessageDialog(null,"TICKET DE COMPRA\n\nNúmero unidades: "+numUnidResp+
        "\nPrecio unidade: "+precUnidResp+"€\n\nTotal: "+total+"€\nCambio: "+cambio+"€\n\nGracias por vir\n\n",
        "TicketCompra [DCancelas]",JOptionPane.PLAIN_MESSAGE);
    }
    
}
