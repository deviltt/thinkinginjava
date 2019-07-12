package com.leetcode;

import java.util.List;

/**
 * 实现一个 Trie (前缀树)，包含 insert, search, 和 startsWith 这三个操作。
 * 示例:
 * Trie trie = new Trie();
 * trie.insert("apple");
 * trie.search("apple");   // 返回 true
 * trie.search("app");     // 返回 false
 * trie.startsWith("app"); // 返回 true
 * trie.insert("app");
 * trie.search("app");     // 返回 true
 * 说明:
 * 你可以假设所有的输入都是由小写字母 a-z 构成的。
 * 保证所有输入均为非空字符串。
 */
class Trie {
    /** Initialize your data structure here. */
    private boolean isWord;
    private char character;
    private Trie[] next=new Trie[26];
    public Trie() {
        this.isWord=false;
        character=' ';
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        char[] chars=word.toCharArray();
        Trie trie=this;
        for (int i = 0; i < chars.length; i++) {
            if (trie.next[chars[i]-'a']==null)
                trie.next[chars[i]-'a']=new Trie();
            trie=trie.next[chars[i]-'a'];
            trie.character=chars[i];
            if (i==chars.length-1)
                trie.isWord=true;
        }
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        char[] chars=word.toCharArray();
        Trie trie=this;
        for (int i = 0; i < chars.length; i++) {
            if (trie.next[chars[i]-'a']!=null){
                trie=trie.next[chars[i]-'a'];
                if (trie.character==chars[i])
                    continue;
                else
                    return false;
            }else {
                return false;
            }
        }
        return trie.isWord;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        char[] chars=prefix.toCharArray();
        Trie trie=this;
        for (int i = 0; i < chars.length; i++) {
            if (trie.next[chars[i]-'a']!=null){
                trie=trie.next[chars[i]-'a'];
                if (trie.character==chars[i])
                    continue;
                else
                    return false;
            }else {
                return false;
            }
        }
        return true;
    }
}
