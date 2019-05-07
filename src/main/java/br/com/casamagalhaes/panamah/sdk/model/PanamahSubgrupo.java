
  package br.com.casamagalhaes.panamah.sdk.model;

  public class PanamahSubgrupo {
      

  private String id;

  public String getId(){
    return id;
  }

  public void setId(String id){
    this.id = id;
  }
  
  private String codigo;

  public String getCodigo(){
    return codigo;
  }

  public void setCodigo(String codigo){
    this.codigo = codigo;
  }
  
  private String descricao;

  public String getDescricao(){
    return descricao;
  }

  public void setDescricao(String descricao){
    this.descricao = descricao;
  }
  
  private String secaoId;

  public String getSecaoId(){
    return secaoId;
  }

  public void setSecaoId(String secaoId){
    this.secaoId = secaoId;
  }
  
  private String grupoId;

  public String getGrupoId(){
    return grupoId;
  }

  public void setGrupoId(String grupoId){
    this.grupoId = grupoId;
  }
  

      public boolean isValid(){
        return this.id != null && this.codigo != null && this.descricao != null && this.secaoId != null && this.grupoId != null;        
      }
  }
  