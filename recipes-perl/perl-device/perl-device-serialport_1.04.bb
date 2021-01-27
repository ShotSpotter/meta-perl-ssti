SUMMARY = "This module allows perl programs to perform serial communication."
DESCRIPTION = "This module provides an object-based user interface essentially identical to the one provided by the Win32::SerialPort module."

HOMEPAGE = "http://search.cpan.org/~cook/Device-SerialPort-1.04/SerialPort.pm"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"

LIC_FILES_CHKSUM = "file://README;beginline=270;endline=271;md5=d64eae8e9f3ca81139753c7c43149f3b"

SRC_URI = "http://search.cpan.org/CPAN/authors/id/C/CO/COOK/Device-SerialPort-${PV}.tar.gz \
           file://Device-SerialPort_Makefile.PL.patch \
           file://SerialPort.pm.patch \
          "

SRC_URI[md5sum] = "82c698151f934eb28c65d1838cee7d9e"
SRC_URI[sha256sum] = "d392567cb39b4ea606c0e0acafd8ed72320311b995336ece5fcefcf9b150e9d7"

S = "${WORKDIR}/Device-SerialPort-${PV}"
RDEPENDS_{$PN} += "perl-module-posix"

inherit cpan perlnative

BBCLASSEXTEND = "native"
