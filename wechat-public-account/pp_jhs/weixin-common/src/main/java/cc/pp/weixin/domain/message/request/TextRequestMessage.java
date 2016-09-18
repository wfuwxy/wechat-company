package cc.pp.weixin.domain.message.request;

import org.dom4j.Element;

import cc.pp.weixin.constant.MsgFieldName;
import cc.pp.weixin.constant.MsgType;


/**
 * 微信公众平台文本消息
 * @author wgybzb
 * @since  2013-04-06
 */
public class TextRequestMessage extends RequestMessage {
	/**
	 * 默认的序列化版本号
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 文本消息内容
	 */
	private String content;
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * 默认消息类型为 文本消息
	 */
	public TextRequestMessage() {
		this.msgType = MsgType.TEXT;
	}

	/**
	 * 构造函数：根据微信平台的请求数据，封装链接消息属性
	 */
	public TextRequestMessage(Element element) {
		//调用父类的构造方法，初始化通用信息
		super(element);

		if (element == null){
			return;
		}
		this.content = element.elementText(MsgFieldName.CONTENT);
	}
}
