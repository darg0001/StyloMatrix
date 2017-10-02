/*******************************************************************************
 * Copyright 2015 McGill University. All rights reserved.                       
 *                                                                               
 * Unless required by applicable law or agreed to in writing, the software      
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF      
 * ANY KIND, either express or implied.                                         
 *******************************************************************************/
package ca.mcgill.sis.dmas.nlp.corpus.parser;

import ca.mcgill.sis.dmas.env.StringResources;

public class TokenizerDefault extends Tokenizer {

	@Override
	public String[] tokenize(String line) {
		return line.split(StringResources.STR_TOKENBREAK);
	}

}