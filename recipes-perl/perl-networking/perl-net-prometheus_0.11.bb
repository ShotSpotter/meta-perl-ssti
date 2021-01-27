SUMMARY = "Net::Prometheus - export monitoring metrics for prometheus"
DESCRIPTION = "Net::Prometheus - export monitoring metrics for prometheus"
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

HOMEPAGE = "https://metacpan.org/pod/Net::Prometheus"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"

LIC_FILES_CHKSUM = "file://LICENSE;md5=4fa536c61510757c30abad389b43a514"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Net-Prometheus-${PV}.tar.gz \
           file://0001-SLK-201-switch-to-Makefile.PL-from-Build.PL.patch \
"

SRC_URI[md5sum] = "c7274629dfd384ef2464d27046dab0dc"
SRC_URI[sha256sum] = "22f809e278ead51936ad539580651b4ce5cbc91c209e4a577ac82383cd9f726a"

S = "${WORKDIR}/Net-Prometheus-${PV}"

RDEPENDS_{$PN} += "perl-struct-dumb perl-json-xs"

inherit cpan
