/** 
 * PROJECT  : ��ɱ�� ������Ʈ
 * NAME  :  NotExistException.java
 * DESC  :  �ߺ����� ó���� ����� ���� ���� Ŭ����
 * 
 * @author  
 * @version 1.0
*/

package dailyfashion.exception;

import lombok.extern.slf4j.Slf4j;

@Slf4j

public class DuplicateException extends Exception {

	public DuplicateException() {
	}

	public DuplicateException(String message) {
		super(message);
		log.warn(message);
	}
}
