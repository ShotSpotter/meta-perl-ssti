SUMMARY = "Canary to check perl compatibility for schmorp's modules"
DESCRIPTION = "This module is used by Schmorp's modules during configuration stage to test the installed perl for compatibility with his modules. It is a dependency of JSON::XS"

HOMEPAGE = "http://search.cpan.org/~mlehmann/Canary-Stability-2001/Stability.pm"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"

LIC_FILES_CHKSUM = "file://COPYING;md5=043dba8b278e1db1b0ef93f30140b02b"

SRC_URI = "http://search.cpan.org/CPAN/authors/id/M/ML/MLEHMANN/Canary-Stability-2001.tar.gz \
"

SRC_URI[md5sum] = "206f6ccad737f796da89ad52a0aa69e3"
SRC_URI[sha256sum] = "360b848e460010f63bbf6ab223455160a766faa46083597222a6b11f59a2b307"


S = "${WORKDIR}/Canary-Stability-2001"

#PROVIDES += "perl-canary-stability"

# inherit native is required so that the module is installed in the sysroot
inherit cpan native

# this may not be necessary
BBCLASSEXTEND = "native"
