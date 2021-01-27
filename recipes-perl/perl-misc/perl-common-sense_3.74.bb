SUMMARY = "This module implements some sane defaults for Perl programs"
DESCRIPTION = "This module implements some sane defaults for Perl programs"

HOMEPAGE = "http://search.cpan.org/~mlehmann/common-sense-3.74/sense.pod"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"

LIC_FILES_CHKSUM = "file://LICENSE;md5=043dba8b278e1db1b0ef93f30140b02b"

SRC_URI = "http://search.cpan.org/CPAN/authors/id/M/ML/MLEHMANN/common-sense-${PV}.tar.gz \
"

SRC_URI[md5sum] = "35b273147200c4c95eef7816f83e572d"
SRC_URI[sha256sum] = "771f7d02abd1ded94d9e37d3f66e795c8d2026d04defbeb5b679ca058116bbf3"

S = "${WORKDIR}/common-sense-${PV}"

inherit cpan
