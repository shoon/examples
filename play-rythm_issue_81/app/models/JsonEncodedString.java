/**
 * The MIT License (MIT)
 * 
 * Copyright (c) 2013 github.com/shoon
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a cop
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
*/
package models;

import javax.persistence.Entity;
import play.db.jpa.Model;

/**
 *
 * @author shoon
 */
@Entity
public class JsonEncodedString extends Model {
    
    public static String smallString = "5g\\u003d\\u003d";
    public static String largeString = "777aAshnadNNlL6bMpBiLN_jyjvZyQanHwckOKMCB0tbS7JQ6mUec1XcDfrXrsYbvq5a5MTivhjTiJ6iSfNA\\u003d\\u003d";
    
}
