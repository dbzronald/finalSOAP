
package clases;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for usuario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="usuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="admin" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="albumes" type="{http://clases/}album" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="amigos" type="{http://clases/}usuario" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="apellidos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="lugarEstudio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lugarNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lugarResidencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lugarTrabajo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="muro" type="{http://clases/}post" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nacimientoFecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postTag" type="{http://clases/}post" minOccurs="0"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usuario", propOrder = {
    "admin",
    "albumes",
    "amigos",
    "apellidos",
    "email",
    "id",
    "lugarEstudio",
    "lugarNacimiento",
    "lugarResidencia",
    "lugarTrabajo",
    "muro",
    "nacimientoFecha",
    "nombre",
    "password",
    "postTag",
    "username",
    "visible"
})
public class Usuario {

    protected boolean admin;
    @XmlElement(nillable = true)
    protected List<Album> albumes;
    @XmlElement(nillable = true)
    protected List<Usuario> amigos;
    protected String apellidos;
    protected String email;
    protected Long id;
    protected String lugarEstudio;
    protected String lugarNacimiento;
    protected String lugarResidencia;
    protected String lugarTrabajo;
    @XmlElement(nillable = true)
    protected List<Post> muro;
    protected String nacimientoFecha;
    protected String nombre;
    protected String password;
    protected Post postTag;
    protected String username;
    protected boolean visible;

    /**
     * Gets the value of the admin property.
     * 
     */
    public boolean isAdmin() {
        return admin;
    }

    /**
     * Sets the value of the admin property.
     * 
     */
    public void setAdmin(boolean value) {
        this.admin = value;
    }

    /**
     * Gets the value of the albumes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the albumes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlbumes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Album }
     * 
     * 
     */
    public List<Album> getAlbumes() {
        if (albumes == null) {
            albumes = new ArrayList<Album>();
        }
        return this.albumes;
    }

    /**
     * Gets the value of the amigos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amigos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmigos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Usuario }
     * 
     * 
     */
    public List<Usuario> getAmigos() {
        if (amigos == null) {
            amigos = new ArrayList<Usuario>();
        }
        return this.amigos;
    }

    /**
     * Gets the value of the apellidos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Sets the value of the apellidos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidos(String value) {
        this.apellidos = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the lugarEstudio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLugarEstudio() {
        return lugarEstudio;
    }

    /**
     * Sets the value of the lugarEstudio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLugarEstudio(String value) {
        this.lugarEstudio = value;
    }

    /**
     * Gets the value of the lugarNacimiento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    /**
     * Sets the value of the lugarNacimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLugarNacimiento(String value) {
        this.lugarNacimiento = value;
    }

    /**
     * Gets the value of the lugarResidencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLugarResidencia() {
        return lugarResidencia;
    }

    /**
     * Sets the value of the lugarResidencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLugarResidencia(String value) {
        this.lugarResidencia = value;
    }

    /**
     * Gets the value of the lugarTrabajo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLugarTrabajo() {
        return lugarTrabajo;
    }

    /**
     * Sets the value of the lugarTrabajo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLugarTrabajo(String value) {
        this.lugarTrabajo = value;
    }

    /**
     * Gets the value of the muro property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the muro property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMuro().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Post }
     * 
     * 
     */
    public List<Post> getMuro() {
        if (muro == null) {
            muro = new ArrayList<Post>();
        }
        return this.muro;
    }

    /**
     * Gets the value of the nacimientoFecha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNacimientoFecha() {
        return nacimientoFecha;
    }

    /**
     * Sets the value of the nacimientoFecha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNacimientoFecha(String value) {
        this.nacimientoFecha = value;
    }

    /**
     * Gets the value of the nombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the value of the nombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the postTag property.
     * 
     * @return
     *     possible object is
     *     {@link Post }
     *     
     */
    public Post getPostTag() {
        return postTag;
    }

    /**
     * Sets the value of the postTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Post }
     *     
     */
    public void setPostTag(Post value) {
        this.postTag = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the visible property.
     * 
     */
    public boolean isVisible() {
        return visible;
    }

    /**
     * Sets the value of the visible property.
     * 
     */
    public void setVisible(boolean value) {
        this.visible = value;
    }

}
