package m2.idm.project.generator;

import m2.idm.project.mLRegression.*;

/**
 * generator code interface
 * @author anaofind
 */
public interface GeneratorCode {

	/**
	 * get extension file
	 * @return the extension file
	 */
	public String getExtension();
	
	/**
	 * code generate
	 * @param the mlreg
	 * @return the code generate
	 */
	public String generate(MLRegression ml);
}
