SUMMARY = "This module converts Perl data structures to JSON and vice versa."
DESCRIPTION = "This module converts Perl data structures to JSON and vice versa. Its primary goal is to be correct and its secondary goal is to be fast. To reach the latter goal it was written in C."

HOMEPAGE = "http://search.cpan.org/~mlehmann/JSON-XS-3.02/XS.pm"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"

LIC_FILES_CHKSUM = "file://COPYING;md5=043dba8b278e1db1b0ef93f30140b02b"

SRC_URI = "http://search.cpan.org/CPAN/authors/id/M/ML/MLEHMANN/JSON-XS-${PV}.tar.gz \
"

SRC_URI[md5sum] = "0d4078f18003b50be970709a77b6afbf"
SRC_URI[sha256sum] = "5f6a5944887d75f1d34440a2d9e69ef12e23f434af23acb143fb0241f40b02be"


S = "${WORKDIR}/JSON-XS-${PV}"

DEPENDS += "perl-canary-stability-native"
RDEPENDS_{$PN} += "perl-common-sense perl-types-serialiser"

inherit cpan perlnative

BBCLASSEXTEND = "native"
