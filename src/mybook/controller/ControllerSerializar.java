package mybook.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import mybook.util.Graph;

/**
 * Classe para serializar os dados.
 */
public class ControllerSerializar {

    private Graph obj;
    private String arqSerial;

    public ControllerSerializar(Graph obj) {
        this.obj = obj;
        arqSerial = "grafo.ser";
    }

    /**
     * Grava os dados em um arquivo .ser
     *
     * @param obj
     * @throws FileNotFoundException.
     * @throws IOException.
     */
    public void gravar(Graph obj) throws FileNotFoundException, IOException {
        FileOutputStream fileoutput = new FileOutputStream(arqSerial);
        ObjectOutputStream objectoutput = new ObjectOutputStream(fileoutput);

        objectoutput.writeObject(obj);
        objectoutput.close();
    }

    /**
     * Recupera os dados de um arquivo .ser
     *
     * @return @throws FileNotFoundException.
     * @throws IOException.
     * @throws ClassNotFoundException.
     */
    public Graph recuperar() throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fileinput = new FileInputStream(arqSerial);
        ObjectInputStream objectinput = new ObjectInputStream(fileinput);

        obj = (Graph) objectinput.readObject();
        objectinput.close();
        return obj;
    }
    
    /**
     * Iguala a variável a uma que está recebendo por parâmetro
     *
     * @param arqSerial variável que será igualada
     */
    public void setArqSerial(String arqSerial) {
        this.arqSerial = arqSerial;
    } 
}