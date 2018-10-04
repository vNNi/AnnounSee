/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package announsee.Models;

import java.io.InputStream;
import java.sql.Blob;

/**
 *
 * @author Vinic
 */
public class Imovel {
    int id;
    int usuId,BinaryInt;
    String categoria,bairro,rua,descricao,telContato,nome,faceContato;
    String preco;
    InputStream foto;
    byte[] blob;
    String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte[] getBlob() {
        return blob;
    }

    public void setBlob(byte[] blob) {
        this.blob = blob;
    }

    public int getUsuId() {
        return usuId;
    }

    public void setUsuId(int usuId) {
        this.usuId = usuId;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTelContato() {
        return telContato;
    }

    public void setTelContato(String telContato) {
        this.telContato = telContato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFaceContato() {
        return faceContato;
    }

    public void setFaceContato(String faceContato) {
        this.faceContato = faceContato;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public InputStream getFoto() {
        return  foto;
    }

    public void setFoto(InputStream foto) {
        this.foto = foto;
    }

    public int getBinaryInt() {
        return BinaryInt;
    }

    public void setBinaryInt(int BinaryInt) {
        this.BinaryInt = BinaryInt;
    }
    
}
