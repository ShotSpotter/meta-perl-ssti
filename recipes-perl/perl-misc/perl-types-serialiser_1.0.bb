SUMMARY = "Types::Serialiser - simple data types for common serialisation formats"
DESCRIPTION = "Types::Serialiser - simple data types for common serialisation formats"

HOMEPAGE = "http://search.cpan.org/~mlehmann/Types-Serialiser-1.0/Serialiser.pm"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"

LIC_FILES_CHKSUM = "file://COPYING;md5=043dba8b278e1db1b0ef93f30140b02b"

SRC_URI = "http://search.cpan.org/CPAN/authors/id/M/ML/MLEHMANN/Types-Serialiser-${PV}.tar.gz \
"

SRC_URI[md5sum] = "76460a2bfbc644672499af89192e03fe"
SRC_URI[sha256sum] = "7ad3347849d8a3da6470135018d6af5fd8e58b4057cd568c3813695f2a04730d"

S = "${WORKDIR}/Types-Serialiser-${PV}"

inherit cpan
