package com.geeks.ds;

public class BeautifullString {



        // Assuming only lower case characters
        static int CHARS = 26;

        /* To check a string S can be converted to a “valid”
       string by removing less than or equal to one
       character. */
        static boolean isValidString(String str) {
            int freq[] = new int[CHARS];

            // freq[] : stores the  frequency of each
            // character of a string
            for (int i = 0; i < str.length(); i++) {
                freq[str.charAt(i) - 'a']++;
            }

            // Find first character with non-zero frequency
            int i, freq1 = 0, count_freq1 = 0;
            for (i = 0; i < CHARS; i++) {
                if (freq[i] != 0) {
                    freq1 = freq[i];
                    count_freq1 = 1;
                    break;
                }
            }

            // Find a character with frequency different
            // from freq1.
            int j, freq2 = 0, count_freq2 = 0;
            for (j = i + 1; j < CHARS; j++) {
                if (freq[j] != 0) {
                    if (freq[j] == freq1) {
                        count_freq1++;
                    } else {
                        count_freq2 = 1;
                        freq2 = freq[j];
                        break;
                    }
                }
            }

            // If we find a third non-zero frequency
            // or count of both frequencies become more
            // than 1, then return false
            for (int k = j + 1; k < CHARS; k++) {
                if (freq[k] != 0) {
                    if (freq[k] == freq1) {
                        count_freq1++;
                    }
                    if (freq[k] == freq2) {
                        count_freq2++;
                    } else // If we find a third non-zero freq
                    {
                        return true;
                    }
                }

                // If counts of both frequencies is more than 1
                if (count_freq1 > 1 && count_freq2 > 1) {
                    return true;
                }
            }

            // Return true if we reach here
            return false;
        }

        // Driver code
        public static void main(String[] args) {
            String str = "bbbaacdafe";

            if (isValidString(str)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            System.out.println(isBeautifulString(str));
        }

    static boolean  isBeautifulString(String inputString) {
        int[] alphabet= new int[26];
        for (int i = 0; i < inputString.length(); i++){
            alphabet[inputString.charAt(i) - 97]++;
        }
        for (int j = 1; j < alphabet.length; j++){
            if (alphabet[j] > alphabet[j-1]){
                return false;
            }
        }
        return true;
    }

    }

