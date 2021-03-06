package br.com.tao.model;

import java.text.DecimalFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="Archive", description = "Classe Utilizada no sistema para os uploads de arquivos")
public class Archive {

	@ApiModelProperty(value = "Propriedade que retorna o identificador do Arquivo", required = true)
	@JsonProperty("id")
	private long id;

	@ApiModelProperty(value = "Propriedade que retorna usuário responsável pelo upload do Arquivo", required = true)
	@JsonProperty("userName")
	private String userName;

	@ApiModelProperty(value = "Propriedade que retorna o tipo do Arquivo", required = true)
	@JsonProperty("mimetypeFile")
	private String mimetypeFile;

	@ApiModelProperty(value = "Propriedade que retorna o nome do Arquivo", required = true)
	@JsonProperty("nameFile")
	private String nameFile;

	@ApiModelProperty(value = "Propriedade que retorna o identificador do Arquivo", required = true)
	@JsonProperty("idFile")
	private long idFile;

	@ApiModelProperty(value = "Propriedade que retorna o conteúdo do Arquivo", required = true)
	@JsonProperty("contentFile")
	private byte[] contentFile;

	@ApiModelProperty(value = "Propriedade que retorna o tamanho do Arquivo", required = true)
	@JsonProperty("sizeFile")
	private Long sizeFile;

	@ApiModelProperty(value = "Propriedade que retorna o tamanho do Arquivo já tratado", required = true)
	@JsonProperty("sizeFileStr")
	private String sizeFileStr;

	@ApiModelProperty(value = "Propriedade que retorna o status do Arquivo", required = true)
	@JsonProperty("Status")
	private Status Status;

	@ApiModelProperty(value = "Propriedade que retorna o tempo de upload do Arquivo", required = true)
	@JsonProperty("timeUpload")
	private String timeUpload;

	public Archive() {
		this.id = 0;
	}

	@JsonIgnore
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@JsonIgnore
	public long getIdFile() {
		return idFile;
	}

	public void setIdFile(long idFile) {
		this.idFile = idFile;
	}

	@JsonIgnore
	public String getMimetypeFile() {
		return mimetypeFile;
	}

	public void setMimetypeFile(String mimetypeFile) {
		this.mimetypeFile = mimetypeFile;
	}

	public String getNameFile() {
		return nameFile;
	}

	public void setNameFile(String nameFile) {
		this.nameFile = nameFile;
	}

	@JsonIgnore
	public byte[] getContentFile() {
		return contentFile;
	}

	public void setContentFile(byte[] contentFile) {
		this.contentFile = contentFile;
	}

	@JsonIgnore
	public Long getSizeFile() {
		return sizeFile;
	}

	public void setSizeFile(Long sizeFile) {
		this.sizeFile = sizeFile;
	}

	public String getSizeFileStr() {
		return sizeFileStr;
	}

	public void setSizeFileStr(long sizeFile) {
		DecimalFormat dec = new DecimalFormat("0.00");
		if (sizeFile > 0) {
			this.sizeFileStr = dec.format((double) sizeFile / 100).concat("Bytes");
		}
		if (sizeFile > 1000) {
			this.sizeFileStr = dec.format((double) sizeFile / 1000).concat("KB");
		}
		if (sizeFile > 1000000) {
			this.sizeFileStr = dec.format((double) sizeFile / 1000000).concat("MB");
		}
		if (sizeFile > 1000000000) {
			this.sizeFileStr = dec.format((double) sizeFile / 1000000000).concat("GB");
		}
	}

	@JsonIgnore
	public Status getStatus() {
		return Status;
	}

	public void setStatus(Status status) {
		Status = status;
	}

	@ApiModelProperty(value = "Propriedade que retorna o Status do arquivo", required = true)
	@JsonProperty("statusStr")
	public String getStatusStr() {
		return Status.toString();
	}

	public String getTimeUpload() {
		return timeUpload;
	}

	public void setTimeUpload(String timeUpload) {
		this.timeUpload = timeUpload;
	}
}
