#!/usr/bin/perl -w
use strict;
use warnings;


#CHECK FOR ARGS AND DECLARE VARS
if (!@ARGV) {
	print ("ERROR: no args\n");
}
else {
	my @file_list = @ARGV;
	my $file_counter = 0;
	my @todelete_list = ();
	my $todelete_counter = 0;
	my $input = 0;



#GET INPUT FOR EACH FILE HERE
	foreach ( @file_list) {
		print "\nWould you like to delete $file_list[$file_counter]? [y or q]: ";

		$input = <STDIN>;

		if($input eq "y\n") {
			$todelete_list[$todelete_counter] = $file_list[$file_counter];
			print "$file_list[$file_counter] has been added to the delete list\n";
			$todelete_counter = $todelete_counter + 1;
		}
		if($input eq "q\n") {
			last;
		}

		$file_counter = $file_counter + 1;
	}



# GET CONFIRMATION HERE
		if($todelete_counter > 0) {
			$todelete_counter = 0;
			print "\nFiles set for deletion: \n";
			foreach (@todelete_list) {
				print "$todelete_list[$todelete_counter]\n";
				$todelete_counter = $todelete_counter + 1;
		}
		print "\nComplete all deletions? [Y]: ";
		$input = <STDIN>;



# DELETE ALL SELECTED FILES HERE
		$todelete_counter = 0;
		if ($input eq "Y\n") {
			foreach (@todelete_list) {
				unlink ("$todelete_list[$todelete_counter]");
				$todelete_counter = $todelete_counter + 1;
			}
			print "All files deleted.\n";
		}
		else {
			print "No Files Deleted.\n";
		}
	}
	else {
		print "No files set for deletion.\n";
	}
}

exit 0;
