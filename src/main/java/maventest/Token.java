/**
 * Classe gerant la modification des text avec les tokens
 * 
 * @autjor Theo Fombasso
 * @version v1 de la classe token
 * @since  13/06/2023 11h
 * 
 * 
 */

package maventest;

import java.util.HashMap;
import java.util.Map;

public class Token {
	
	
	private HashMap<String, String> list = new HashMap<String, String>();
	
	/**
	 * 
	 * Ajoute une valeur lie a un token 
	 * Les token entree sont sous la forme {name}
	 * 
	 * @Param token 	l'element a transformer dans futurre text
	 * @Param value		valeur qui remplacera le token
	 * @return pas de retour
	 * @see rien
	 * 
	 * 
	 */
	public void addToken(String token, String value) {
		list.put(token, value);
	}
	
	/**
	 * 
	 * Ajoute une valeur lie a un token 
	 * Les token entree sont sous la forme {name}
	 * 
	 * @Param token supprime le token envoyer de la list
	 * @return pas de retour
	 * @see rien
	 * 
	 * 
	 */
	public void removeToken(String token) {
		list.remove(token);
	}
	
	/**
	 * 
	 * Ajoute une valeur lie a un token 
	 * Les token entree sont sous la forme {name}
	 * 
	 * @Param text text sur le quel sera remplace les tokens avec leur valeur associe
	 * @return retourne le text modifie
	 * @see le texte remplace complet
	 * 
	 * 
	 */
	public String transform(String text) {
		
		String value;
		String key;
		
		for(Map.Entry<String, String> entry : list.entrySet()) {
			 key = entry.getKey();
			 value = entry.getValue();
			 text = text.replace(key, value);
		}
		return text;
	}

}
