/*
 * Copyright (c) 2012-2014 nadavc <https://twitter.com/nadavc>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the WTFPL, Version 2, as published by Sam Hocevar.
 * See the COPYING file for more details.
 */

package org.groovykoans.koan09

class Robot {

    int x
    int y
    def regex = ~ "[A-Z][a-z]+"

    void left() {
        x--
    }

    void right() {
       x++
    }

    void up() {
        y++
    }

    void down() {
        y--
    }

    def methodMissing(String name, args) {
        (name =~ regex).each {
            String match ->
                invokeMethod(match.toLowerCase(), null)
        }
    }

}
