
package com.hyf.weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getWeatherbyCityNameProResult" type="{http://WebXml.com.cn/}ArrayOfString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getWeatherbyCityNameProResult"
})
@XmlRootElement(name = "getWeatherbyCityNameProResponse")
public class GetWeatherbyCityNameProResponse {

    protected ArrayOfString getWeatherbyCityNameProResult;

    /**
     * 获取getWeatherbyCityNameProResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getGetWeatherbyCityNameProResult() {
        return getWeatherbyCityNameProResult;
    }

    /**
     * 设置getWeatherbyCityNameProResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setGetWeatherbyCityNameProResult(ArrayOfString value) {
        this.getWeatherbyCityNameProResult = value;
    }

}