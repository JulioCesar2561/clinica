package br.com.clinica.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "dentista")
public class Dentista extends Pessoa {

    public Dentista() {
    }
    public Dentista(String nome, Integer idade, Profile profile, List<Endereco> enderecos, String cpf) {
        super(nome, idade, profile, enderecos, cpf);
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String cro;

    @ManyToMany
    @JoinTable(name = "dentisata_especialidade",
            joinColumns = @JoinColumn(name = "id_dentista", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_especialidade", referencedColumnName = "id"))
    private List<Especialidade> especialidades;

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getCro() {
        return cro;
    }

    public void setCro(String cro) {
        this.cro = cro;
    }

    public List<Especialidade> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<Especialidade> especialidades) {
        this.especialidades = especialidades;
    }

}
