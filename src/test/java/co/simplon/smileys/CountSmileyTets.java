package co.simplon.smileys;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import co.simplo.smileys.CountSmileys;

public class CountSmileyTets {

	@Test
	public void ShouldRturn0IfNullInput () {
		//CountSmileys.countSmileys(null);
		// On attends la valeur 1 lors du retour de l'appel fonction 
		assertEquals(0, CountSmileys.countSmileys(null));
	}
	
	@Test
	public void ShouldRturn0IfEmpty() {

		List<String> list = new ArrayList<String>();
		assertEquals(0, CountSmileys.countSmileys(list));
	}

	@Test
	public void ShouldRturn1IfSmiley() {

		List<String> list = new ArrayList<String>();
		list.add(";)");
;
		assertEquals(1, CountSmileys.countSmileys(list));
	}
	@Test
	public void ShouldRturn1IfFauxSmiley() {

		List<String> list = new ArrayList<String>();
		list.add(";}");
		assertEquals(0, CountSmileys.countSmileys(list));
	}
}
